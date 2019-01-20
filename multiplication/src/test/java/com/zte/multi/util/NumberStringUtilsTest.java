package com.zte.multi.util;



import static org.junit.Assert.*;

import com.zte.multi.dto.NumberString;
import org.junit.*;

import java.util.ArrayList;


public class NumberStringUtilsTest {
    @Test
    public void whenLengthLessThanFourThenNoSplit(){
        ArrayList<NumberString> numbers = NumberStringUtils.splitNumber("1234");
        NumberString numberString = numbers.get(0);
        assertEquals(1,numbers.size());
        assertEquals(1234,numberString.getNumberPrefix());
        assertEquals(0,numberString.getZeroCount());
    }
    @Test
    public void whenLengthMoreThanFourThenSplit(){
        ArrayList<NumberString> numbers = NumberStringUtils.splitNumber("12345");
        assertEquals(2,numbers.size());
        NumberString numberString = numbers.get(0);
        assertEquals(1234,numberString.getNumberPrefix());
        assertEquals(1,numberString.getZeroCount());
        NumberString numberStringTwo = numbers.get(1);
        assertEquals(5,numberStringTwo.getNumberPrefix());
        assertEquals(0,numberStringTwo.getZeroCount());
    }
}
