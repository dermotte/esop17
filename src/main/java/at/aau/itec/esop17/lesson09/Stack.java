package at.aau.itec.esop17.lesson09;

public class Stack {
    public StackItem[] data;
    private int top = 0; // first empty element

    public Stack(int size) {
        data = new StackItem[size];
    }

    public Stack() {
        data = new StackItem[32];
    }

    /**
     * This method puts an elemen on top of the stack and returns true if succeeded
     * @param d
     * @return
     */
    public boolean push(StackItem d) {
        if (top >= data.length) return false;
        data[top] = d;
        top++;
        return true;
    }

    public StackItem pop() throws StackIsEmptyException{
        if (top <= 0)
            throw new StackIsEmptyException();
        StackItem result = data[top - 1]; // get result from the top
        top = top - 1; // set top one lower ...
        return result;
    }

    /**
     *
     * @return top object or null if there is none
     */
    public StackItem peak() {
        if (top - 1 <= 0)
            return null;
        return data[top - 1];
    }

    public int size() {
        return top;
    }
}
