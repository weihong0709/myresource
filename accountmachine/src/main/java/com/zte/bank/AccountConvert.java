package com.zte.bank;

import java.util.ArrayList;

public class AccountConvert {

    private static final int GRAPH_NUMBER_LENGTH=3;

    GraphAccount graphAccount;
    public AccountConvert(GraphAccount account){
        this.graphAccount = account;
    }
    public Account convert(){
        ArrayList<GraphNumber> graphNumbers = this.convertToGraphNumbers();
        Account account =  convertToAccount(graphNumbers);
        if (!account.isValid()){

        }
        return  convertToAccount(graphNumbers);
    }
    private ArrayList<GraphNumber> convertToGraphNumbers(){
        ArrayList<GraphNumber> graphNumbers = new ArrayList<>();
        String firstLine = graphAccount.getFistLine();
        String secondLine = graphAccount.getSecondLine();
        String lastLine = graphAccount.getLastLine();
        for (int i=0;i<9;i++){
            int begin = i*GRAPH_NUMBER_LENGTH;
            int end  = i*GRAPH_NUMBER_LENGTH+GRAPH_NUMBER_LENGTH;
            String head = firstLine.substring(begin,end);
            String middle = secondLine.substring(begin,end);
            String bottom = lastLine.substring(begin,end);
            GraphNumber graphNumber = new GraphNumber(new GraphPart(head),new GraphPart(middle),new GraphPart(bottom));
            graphNumbers.add(graphNumber);

        }
        return graphNumbers;
    }
    private Account convertToAccount(ArrayList<GraphNumber> graphNumbers){
        StringBuilder builder = new StringBuilder();
        for (GraphNumber graphNumber:graphNumbers) {
            builder.append(graphNumber.getNumber());
        }
        Account account=  new Account();
        account.setAccountNumber(builder.toString());
        account.setValid(true);
        return account;

    }



}
