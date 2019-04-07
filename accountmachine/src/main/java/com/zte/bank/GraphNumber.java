package com.zte.bank;

import java.util.Objects;

public class GraphNumber {

    private GraphPart head;
    private GraphPart middle;
    private GraphPart bottom;
    private int number=GraphNumberConstants.NO_CONVERT;


    public GraphNumber(GraphPart head,GraphPart middle,GraphPart bottom){
        this.head = head;
        this.middle = middle;
        this.bottom = bottom;
    }

    public int getNumber() {
        if (number==GraphNumberConstants.NO_CONVERT){
            convert();
        }
        return number;
    }

    private void convert() {
        if (equals(GraphNumberConstants.ONE)){
            this.number = 1;
        }else if (equals(GraphNumberConstants.TWO)){
            this.number= 2;
        }else if (equals(GraphNumberConstants.THREE)){
            this.number= 3;
        }else if (equals(GraphNumberConstants.FOUR)){
            this.number= 4;
        }else if (equals(GraphNumberConstants.FIVE)){
            this.number= 5;
        }else if (equals(GraphNumberConstants.SIX)){
            this.number= 6;
        }else if (equals(GraphNumberConstants.SEVEN)){
            this.number= 7;
        }else if (equals(GraphNumberConstants.EIGHT)){
            this.number= 8;
        }else if (equals(GraphNumberConstants.NINE)){
            this.number= 9;
        }else {
           this.number=GraphNumberConstants.UNKNOWN;
        }
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphNumber that = (GraphNumber) o;
        return head.equals(that.head) &&middle.equals(that.middle) &&bottom.equals(that.bottom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(head, middle, bottom);
    }
}
