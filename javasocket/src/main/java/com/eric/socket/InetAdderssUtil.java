package com.eric.socket;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAdderssUtil {
    /**
     * 从抓包看会从本地DNS开始查找
     */
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
    public InetAddress[] getAllAddressByName(String name){
        try {
            InetAddress[] inetAddress =  InetAddress.getAllByName(name);
            for (int i = 0; i < inetAddress.length; i++) {
                System.out.println("getAllAddressByName"+inetAddress[i]);

            }
            return inetAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;

    }
    public InetAddress getLocalHost(){
        try {
            InetAddress inetAddress =  InetAddress.getLocalHost();
            System.out.println(inetAddress);
            return inetAddress;
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        return null;

    }
}
