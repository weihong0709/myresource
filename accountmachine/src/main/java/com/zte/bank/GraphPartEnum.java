package com.zte.bank;

public enum GraphPartEnum {
    EMPTY("   "),
    HAS_HEAD("|  "),
    HAS_MIDDLE(" _ "),
    HAS_TAIL("  |"),
    HAS_HEAD_MIDDLE("|_ "),
    HAS_HEAD_TAIL("| |"),
    HAS_MIDDLE_TAIL(" _|"),
    HAS_ALL("|_|");

    public GraphPart getGraphPart() {
        return graphPart;
    }

    private GraphPart graphPart;
    GraphPartEnum(String value){
        this.graphPart = new GraphPart(value);
    }
}
