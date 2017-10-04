package at.aau.itec.esop17.lesson01;

public class MaximumOfThree {
    public static void main(String[] args) {
        int a = 11, b = 12, c = 13;

        int max = a;

        if (a < b) {
            if (b < c) max = c;
            else max = b;
        } else {
            if (a < c) max = c;
            else max = a;
        }
        System.out.println(max);
    }
}
