package at.aau.itec.esop17.lesson03;

import java.util.Scanner;

/**
 * Created by mlux on 05.10.2017.
 */
public class Average {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numNumbers = s.nextInt();
        int sum = 0;
        for (int i = 0; i < numNumbers; i++) {
            System.out.print("Please enter operand #" + i + ": ");
            sum += s.nextInt();
        }
        System.out.println("Sum is " + sum);
    }
}
