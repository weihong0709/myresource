package com.eric.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdderssUtil {
    public InetAddress getAddressByName(String name){
        try {
            InetAddress inetAddress =  InetAddress.getByName(name);
            System.out.println(inetAddress);
            return inetAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;

    }
}
