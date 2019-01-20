package com.zte.multi.dto;

import java.security.PrivateKey;

public class NumberString {
    private int numberPrefix;
    private int zeroCount;

    public NumberString(int numberPrefix, int zeroCount) {
        this.numberPrefix = numberPrefix;
        this.zeroCount = zeroCount;
    }

    public int getZeroCount() {
        return zeroCount;
    }

    public void setZeroCount(int zeroCount) {
        this.zeroCount = zeroCount;
    }



    public int getNumberPrefix() {
        return numberPrefix;
    }

    public void setNumberPrefix(int numberPrefix) {
        this.numberPrefix = numberPrefix;
    }
}
