package at.aau.itec.esop17.lesson05;

public class FindMax {
    public static void main(String[] args) {
        printNumbers(12, 13, 14, 15, 42);
    }

    private static void printNumbers(int... number) {
        for (int j = 0; j < number.length; j++) {
            System.out.println(number[j]);
        }
    }
}
