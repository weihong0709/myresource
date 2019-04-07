package com.zte.bank;
public class Account {
    private String accountNumber;
    private boolean isValid;

    public boolean isValid() {
        isValid = this.isCheckSumValid();
        return isValid;
    }

    public void setValid(boolean valid) {
        isValid = valid;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    private boolean isCheckSumValid(){
       char[] numbers= accountNumber.toCharArray();
       int checkSum = 0;
        for (int i=0;i<numbers.length;i++){
            checkSum+=(9-i)*Integer.parseInt(String.valueOf(numbers[i]));
        }
        if (checkSum%11==0){
            return true;
        }else {
            return false;
        }

    }

}
