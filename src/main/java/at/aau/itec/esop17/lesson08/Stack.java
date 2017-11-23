package at.aau.itec.esop17.lesson08;

public class Stack extends DataStructure{
    int top = 0; // first empty element

    public Stack(int size) {
        super(size);
    }

    public Stack() {
        super(32);
    }

    /**
     * This method puts an elemen on top of the stack and returns true if succeeded
     * @param d
     * @return
     */
    public boolean push(double d) {
        if (top >= data.length) return false;
        data[top] = d;
        top++;
        return true;
    }

    public double pop() {
        if (top <= 0)
            return -1;
        double result = data[top - 1]; // get result from the top
        top = top - 1; // set top one lower ...
        return result;
    }

    public double peak() {
        if (top - 1 <= 0)
            return -1;
        return data[top - 1];
    }

    public int size() {
        return top;
    }
}
