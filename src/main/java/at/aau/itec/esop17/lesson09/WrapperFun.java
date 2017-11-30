package at.aau.itec.esop17.lesson09;

public class WrapperFun {
    public static void main(String[] args) {
        int a = 42;
        Object c = a;
        int b = (int) c;
        System.out.println(c);
        int[] i = new int[42];
        try {
            fillInt(i);
        } catch (ArithmeticException e) {
            System.err.println("Something is " +
                    "wrong with the numbers: " +
                    e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.err.println("OMG The index is " +
                    "too large!");
            // e.printStackTrace();
        }
        System.exit(0);
    }

    private static void fillInt(int[] i) {
        for (int j = 0; j < i.length; j++) {
            i[j] = j;
        }

    }
}
