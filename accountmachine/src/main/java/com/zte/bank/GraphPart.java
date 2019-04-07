package com.zte.bank;

import java.util.Objects;

public class GraphPart {
    private String value;
    public GraphPart(String value){
        this.value = value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GraphPart graphPart = (GraphPart) o;
        return Objects.equals(value, graphPart.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value);
    }
}
