package com.eric.socket;

import org.junit.Test;

import static org.junit.Assert.*;

public class InetAdderssUtilTest {

    @Test
    public void getAddressByName() {

        InetAdderssUtil inetAdderssUtil = new InetAdderssUtil();
        inetAdderssUtil.getAddressByName("www.zte.com.cn");
    }

    @Test
    public void getAllAddressByName(final String test) {
        InetAdderssUtil inetAdderssUtil = new InetAdderssUtil();
        inetAdderssUtil.getAllAddressByName("www.sina.com.com");

    }

    @Test
    public void getLocalHost() {
        InetAdderssUtil inetAdderssUtil = new InetAdderssUtil();
        inetAdderssUtil.getLocalHost();

    }
}