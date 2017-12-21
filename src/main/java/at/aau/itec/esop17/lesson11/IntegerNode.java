package at.aau.itec.esop17.lesson11;

public class IntegerNode extends Node {
    Integer value;

    public IntegerNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }
}
