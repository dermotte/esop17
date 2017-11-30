package at.aau.itec.esop17.lesson09;

public class OperatorStackItem extends StackItem {
    String op = "+";

    public OperatorStackItem(String op) {
        this.type = 1;
    }
}
