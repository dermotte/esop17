package at.aau.itec.esop17.lesson09;

public abstract class StackItem {
    /**
     * 0 is a number, 1 is an operator, ...
     */
    protected int type = 0;

    public int getType() {
        return type;
    }
}
