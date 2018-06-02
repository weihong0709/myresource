package com.eric.semaphore;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class BoundArrayListTest {
    BoundArrayList<String> boundArrayList = null;

    @Before
    public void setUp() throws Exception {
         boundArrayList = new BoundArrayList<>(3);

    }

    @After
    public void tearDown() throws Exception {
        boundArrayList = null;
    }

    @Test
    public void add() {
        Runnable runnable = ()->{
            try {
                boundArrayList.add("222");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        };
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();
        new Thread(runnable).start();

    }
}