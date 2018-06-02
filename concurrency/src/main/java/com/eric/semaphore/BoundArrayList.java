package com.eric.semaphore;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Semaphore;

public class BoundArrayList<T> {
    private final List<T> arrayList;
    private final Semaphore semaphore;
    public BoundArrayList(int bound){
        this.arrayList = Collections.synchronizedList(new ArrayList<T>());
        semaphore = new Semaphore(bound);
    }
    public boolean add(T a) throws InterruptedException {
        semaphore.acquire();
        boolean wasAdd = false;
        try {
            wasAdd = arrayList.add(a);
            System.out.println("wasAdd:"+wasAdd);
            return  wasAdd;
        }finally {
            if(!wasAdd){
                semaphore.release();
            }
        }
    }


}
