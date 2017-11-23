package at.aau.itec.esop17.lesson08;

public class Queue extends DataStructure{
    int head = 0; // first element
    int tail = 0; // first position after last element
    boolean queueFull = false;


    public Queue(int size) {
        super(size);
    }

    public void put(double d) {
        if (!queueFull) {
            data[tail] = d;
            tail++;
            tail %= data.length;
        }
        if (tail == head)
            queueFull = true;
    }

    public double get() {
        if (head == tail && !queueFull) // list is empty
            return -1;
        else {
            double result = data[head];
            head = head + 1;
            head %= data.length;
            queueFull = false;
            return result;
        }

    }

    public int size() {
        if (tail < head) return tail + data.length - head;
        return tail - head;
    }
}
