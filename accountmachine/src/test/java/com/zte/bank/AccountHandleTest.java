package com.zte.bank;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AccountHandleTest {
    private GraphAccount account;
    private AccountConvert accountConvert;
    @Before
    public void init(){
        account = new GraphAccount();
        accountConvert = new AccountConvert(account);
    }
    @Test
    public void testWhenNumberIsValid(){
          account.setFistLine("    _  _     _  _  _  _  _ ");
        account.setSecondLine("  | _| _||_||_ |_   ||_||_|");
          account.setLastLine("  ||_  _|  | _||_|  ||_| _|");

        ConvertResult convertResult= accountConvert.convert();
        assertEquals("123456789",convertResult.getAccountNumber());
        assertEquals(true,convertResult.isValid());


    }
    @Test
    public void testWhenCheckSumIsNotValid(){
          account.setFistLine("    _  _     _  _  _  _  _ ");
        account.setSecondLine("  | _| _||_||_ |_   ||_||_|");
          account.setLastLine("  ||_  _|  | _||_|  ||_| _|");

        ConvertResult convertResult= accountConvert.convert();
        assertEquals("123456789",convertResult.getAccountNumber());
        assertEquals(true,convertResult.isValid());


    }


}