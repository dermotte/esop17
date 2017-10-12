package at.aau.itec.esop17.lesson04;

public class SumOfNumbers {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i<4; i++) {
            sum += (i+1);
        }
        System.out.println("sum = " + sum);
    }
}
