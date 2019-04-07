package com.zte.bank;

public class GraphNumberConstants {
    public static final GraphNumber ONE = new GraphNumber(GraphPartEnum.EMPTY.getGraphPart(),GraphPartEnum.HAS_TAIL.getGraphPart(),GraphPartEnum.HAS_TAIL.getGraphPart());
    public static final GraphNumber TWO = new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_MIDDLE_TAIL.getGraphPart(),GraphPartEnum.HAS_HEAD_MIDDLE.getGraphPart());
    public static final GraphNumber THREE = new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_MIDDLE_TAIL.getGraphPart(),GraphPartEnum.HAS_MIDDLE_TAIL.getGraphPart());
    public static final GraphNumber FOUR= new GraphNumber(GraphPartEnum.EMPTY.getGraphPart(),GraphPartEnum.HAS_ALL.getGraphPart(),GraphPartEnum.HAS_TAIL.getGraphPart());
    public static final GraphNumber FIVE= new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_HEAD_MIDDLE.getGraphPart(),GraphPartEnum.HAS_MIDDLE_TAIL.getGraphPart());
    public static final GraphNumber SIX= new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_HEAD_MIDDLE.getGraphPart(),GraphPartEnum.HAS_ALL.getGraphPart());
    public static final GraphNumber SEVEN= new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_TAIL.getGraphPart(),GraphPartEnum.HAS_TAIL.getGraphPart());
    public static final GraphNumber EIGHT= new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_ALL.getGraphPart(),GraphPartEnum.HAS_ALL.getGraphPart());
    public static final GraphNumber NINE= new GraphNumber(GraphPartEnum.HAS_MIDDLE.getGraphPart(),GraphPartEnum.HAS_ALL.getGraphPart(),GraphPartEnum.HAS_MIDDLE_TAIL.getGraphPart());

    public static final int NO_CONVERT=-1;
    public static final int UNKNOWN=-2;


}
