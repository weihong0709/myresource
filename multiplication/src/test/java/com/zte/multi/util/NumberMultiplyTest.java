package com.zte.multi.util;

import org.junit.Test;

import static org.junit.Assert.*;

public class NumberMultiplyTest {
    @Test
    public void WhenOneIsZeroThenZero(){
        NumberMultiply  numberMultiply = new NumberMultiply("0","100");
        String result = numberMultiply.multiply();
        assertEquals("0",result);
    }
    @Test
    public void WhenAllIsZeroThenZero(){
        NumberMultiply  numberMultiply = new NumberMultiply("0","0");
        String result = numberMultiply.multiply();
        assertEquals("0",result);
    }

    @Test
    public void WhenOneMoreThanInt(){
        NumberMultiply  numberMultiply = new NumberMultiply("123987766555","100");
        String result = numberMultiply.multiply();
        assertEquals("12398776655500",result);
    }


    @Test
    public void WhenAllMoreThanInt(){
        NumberMultiply  numberMultiply = new NumberMultiply("123987766555","10000000000");
        String result = numberMultiply.multiply();
        assertEquals("1239877665550000000000",result);
    }
}