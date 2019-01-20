package com.zte.multi.util;

public class NumberPlus {
    private String addParaOne;
    private String addParaTwo;
    private boolean isCarry;
    private  char[] result;


    public NumberPlus(String addParaOne, String addParaTwo) {
        this.addParaOne = addParaOne;
        this.addParaTwo = addParaTwo;
    }

    public String plus() {
        if (addParaOne.length() >= addParaTwo.length()) {
            return this.plus(addParaOne,addParaTwo);
        } else {
            return this.plus(addParaTwo,addParaOne);

        }
    }

    private String plus(String maxLengthNumber, String minLengthNumber) {
        char[] result = new char[maxLengthNumber.length()];
        char[] maxLengthNumberArray = maxLengthNumber.toCharArray();
        char[] minLengthNumberArray = minLengthNumber.toCharArray();

        for (int i = 1; i <= maxLengthNumberArray.length; i++) {

            int addResult = getAddResult(maxLengthNumberArray, minLengthNumberArray, i);
            result[maxLengthNumberArray.length-i] = getCurrentPositionChar(addResult);
            setIsCarry(addResult);

        }
        return getFinalResult(result);


    }

    private String getFinalResult(char[] result) {
        if (isCarry) {
            return "1" + String.valueOf(result);
        } else {
            return String.valueOf(result);
        }

    }

    private char getCurrentPositionChar( int addResult) {
        if (addResult > 9) {
            return String.valueOf(addResult).toCharArray()[1];
        } else {
            return String.valueOf(addResult).toCharArray()[0];
        }
    }
    private void setIsCarry(int addResult) {
        if (addResult > 9) {
            isCarry = true;
        } else {
            isCarry = false;
        }
    }

    private int getAddResult(char[] maxLengthNumberArray, char[] minLengthNumberArray, int index) {
        int addResult = 0;
        if (minLengthNumberArray.length >= index) {

            addResult = this.addTwoChar(maxLengthNumberArray[maxLengthNumberArray.length - index],minLengthNumberArray[ minLengthNumberArray.length - index]);
        }else {
            addResult = Integer.parseInt(String.valueOf(maxLengthNumberArray[maxLengthNumberArray.length - index]));
        }
        if (isCarry) {
            addResult = addResult + 1;
        }
        return addResult;
    }

    private int addTwoChar(char addOneChar,char addTwoChar){
        return Integer.parseInt(String.valueOf(addOneChar)) + Integer.parseInt(String.valueOf(addTwoChar));
    }
}
