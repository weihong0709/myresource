package com.eric.datatype;

import  static org.junit.Assert.*;
import org.junit.Test;

public class DataTypeTest {
    public static final  int  a=1;

    @Test
    public void testInt(){
        Integer one = new Integer(10);
        Integer two = new Integer(10);
        try {
            byte[] bytes = new byte[10000000];
            Thread.sleep(1000000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        assertEquals(one,two);
    }
}
