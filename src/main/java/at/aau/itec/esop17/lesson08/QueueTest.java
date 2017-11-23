package at.aau.itec.esop17.lesson08;

public class QueueTest {
    public static void main(String[] args) {
        Queue q = new Queue(13);
        for (int i = 0; i< 10; i++) {
            q.put(i);
            q.put(i*2);
            q.put(i*3);
            System.out.println(q.get());
            System.out.println(q.get());
            System.out.println(q.get());
        }
        for (int i = 0; i< 10; i++) {
            System.out.println(q.get());
        }
    }
}
