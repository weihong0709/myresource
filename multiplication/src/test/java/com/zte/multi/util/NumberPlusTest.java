package com.zte.multi.util;


import com.zte.multi.dto.NumberString;
import org.junit.Test;


import static org.junit.Assert.*;


public class NumberPlusTest {

    @Test
    public void whenLengthEquals() {
        NumberPlus numberPlus = new NumberPlus("1001","1002");
        String result = numberPlus.plus();
        assertEquals("2003",result);
    }
    @Test
    public void whenLengthMoreThan() {
        NumberPlus numberPlus = new NumberPlus("10011","1002");
        String result = numberPlus.plus();
        assertEquals("11013",result);
    }
    @Test
    public void whenLengthLessThan() {
        NumberPlus numberPlus = new NumberPlus("1001","10023");
        String result = numberPlus.plus();
        assertEquals("11024",result);
    }
    @Test
    public void whenExistsCarry() {
        NumberPlus numberPlus = new NumberPlus("1041","10093");
        String result = numberPlus.plus();
        assertEquals("11134",result);
    }
    @Test
    public void whenFirstExistsCarry() {
        NumberPlus numberPlus = new NumberPlus("33041","80093");
        String result = numberPlus.plus();
        assertEquals("113134",result);
    }
}
