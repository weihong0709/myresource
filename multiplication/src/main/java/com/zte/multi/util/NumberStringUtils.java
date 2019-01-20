package com.zte.multi.util;

import com.zte.multi.dto.NumberString;

import java.util.ArrayList;

public class NumberStringUtils {
    private static final int NUMBERPREFIX_LENGTH=4;

    public static ArrayList<NumberString> splitNumber(String number){
        if (number.length()<=4){
          return splitLengthLessThanFour(number);
        }else {
            return splitLengthMoreThanFour(number);
        }
    }

    private static ArrayList<NumberString> splitLengthLessThanFour(String number){
        ArrayList<NumberString> result = new ArrayList<NumberString>();
        if(number!=null&&number.trim().length()>0){
            NumberString numberString = new NumberString(Integer.parseInt(number),0);
            result.add(numberString);
        }
        return result;
    }

    private static ArrayList<NumberString> splitLengthMoreThanFour(String number){
        ArrayList<NumberString> result = new ArrayList<NumberString>();

        int numberPrefix = Integer.parseInt(number.substring(0,NUMBERPREFIX_LENGTH));
        String numberLeft = number.substring(NUMBERPREFIX_LENGTH);
        int zeroCount = numberLeft.length();

        NumberString numberString = new NumberString(numberPrefix,zeroCount);
        result.add(numberString);

        ArrayList<NumberString> resultLeft = splitNumber(numberLeft);
        result.addAll(resultLeft);
        return result;
    }
}
