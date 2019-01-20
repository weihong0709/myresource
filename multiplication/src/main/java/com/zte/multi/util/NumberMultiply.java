package com.zte.multi.util;

import com.zte.multi.dto.NumberString;

import java.util.ArrayList;

public class NumberMultiply {
    private String multiParaOne;
    private String multiParaTwo;

    private ArrayList<NumberString> multiParaOneArray;
    private ArrayList<NumberString> multiParaTwoArray;

    public NumberMultiply(String multiParaOne, String multiParaTwo) {
        this.multiParaOne = multiParaOne;
        this.multiParaTwo = multiParaTwo;
    }

    public String multiply() {
        this.splitNumber();
        ArrayList<NumberString> multiplyResult= this.multiplyArray();
        ArrayList<String> numberList=this.convertNumberToString(multiplyResult);
        return  this.plus(numberList);
    }

    private void splitNumber() {
        multiParaOneArray = NumberStringUtils.splitNumber(multiParaOne);
        multiParaTwoArray = NumberStringUtils.splitNumber(multiParaTwo);
    }

    private ArrayList<NumberString> multiplyArray() {
        ArrayList<NumberString> multiplyResult = new ArrayList<NumberString>();
        for (NumberString numberStringOne : multiParaOneArray) {
            for (NumberString numberStringTwo : multiParaTwoArray) {
                multiplyResult.add(this.multiply(numberStringOne, numberStringTwo));
            }
        }
        return multiplyResult;
    }

    private NumberString multiply(NumberString numberStringOne, NumberString numberStringTwo) {
        int numberPrefix = numberStringOne.getNumberPrefix() * numberStringTwo.getNumberPrefix();
        int zeroCount = numberStringOne.getZeroCount() + numberStringTwo.getZeroCount();
        return new NumberString(numberPrefix, zeroCount);

    }

    public ArrayList<String> convertNumberToString(ArrayList<NumberString> multiplyResult) {
        ArrayList<String> result = new ArrayList<String>();
        for (NumberString numberString : multiplyResult) {
            result.add(this.convertNumberToString(numberString));
        }
        return result;
    }

    private String convertNumberToString(NumberString numberString) {
        StringBuilder result = new StringBuilder(String.valueOf(numberString.getNumberPrefix()));
        for (int i = 0; i < numberString.getZeroCount(); i++) {
            result.append("0");
        }
        return result.toString();

    }

    private String plus(ArrayList<String> numbers) {
        String result = "0";
        for (String number : numbers) {
            NumberPlus numberPlus = new NumberPlus(result, number);
            result = numberPlus.plus();
        }
        return result;
    }


}
