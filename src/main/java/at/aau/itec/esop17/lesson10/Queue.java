package at.aau.itec.esop17.lesson10;

public class Queue{
    QueueItem[] data;
    int head = 0; // first element
    int tail = 0; // first position after last element
    boolean queueFull = false;


    public Queue(int size) {
        data = new QueueItem[size];
    }

    public void put(QueueItem d) throws QueueIsFullException{
        if (!queueFull) {
            data[tail] = d;
            tail++;
            tail %= data.length;
        } else { // exception
            throw new QueueIsFullException("Queue is full");
        }
        if (tail == head)
            queueFull = true;
    }


    public QueueItem get() throws QueueIsEmptyException {
        if (head == tail && !queueFull) // list is empty
            throw new QueueIsEmptyException("Queue is empty!");
        else {
            QueueItem result = data[head];
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
