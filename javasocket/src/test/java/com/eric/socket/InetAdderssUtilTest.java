package com.eric.socket;

import org.junit.Test;

import static org.junit.Assert.*;

public class InetAdderssUtilTest {

    @Test
    public void getAddressByName() {
        InetAdderssUtil inetAdderssUtil = new InetAdderssUtil();
        inetAdderssUtil.getAddressByName("www.sina.com.cn");
    }
}