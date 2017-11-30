package at.aau.itec.esop17.lesson09;

public class StackTest {
    public static void main(String[] args) {
        StackItem s1 = new IntegerStackItem(3);
        StackItem s2 = new IntegerStackItem(2);
        StackItem s3 = new IntegerStackItem(1);

        Stack s = new Stack();
        s.push(s1);
        s.push(s2);
        s.push(s3);
        int count = 6;

        try {
            while (count-- > 0) {
                StackItem o = null;
                o = s.pop();
                if (o instanceof IntegerStackItem) {
                    IntegerStackItem s_temp = (IntegerStackItem) o;
                    System.out.println(s_temp.value);
                } else {
                    System.err.println("Object is not instance of " +
                            "IntegerStackItem");
                }
            }
        } catch (StackIsEmptyException e) {
            e.printStackTrace();
        }


    }
}
