package com.eric.datatype;

import  static org.junit.Assert.*;
import org.junit.Test;

public class DataTypeTest {
    @Test
    public void testInt(){
        Integer one = new Integer(10);
        Integer two = new Integer(10);
        assertEquals(one,two);
    }
}
