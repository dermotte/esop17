package at.aau.itec.esop17.lesson10;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(4);
        try {
            q.put(new StringQueueItem("foo"));
            q.put(new StringQueueItem("bar"));
            q.put(new StringQueueItem("hello"));
            q.put(new StringQueueItem("world"));
            q.put(new IntegerQueueItem(42));
            q.get();
            q.get();
            q.get();
            q.get();
            q.get();
            q.get();
            q.put(new StringQueueItem("wtf"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
