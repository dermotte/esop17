package at.aau.itec.esop17.lesson03;

import java.util.Scanner;

/**
 * Created by mlux on 05.10.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        // Von System In lesen via Scanner:
        Scanner myScanner = new Scanner(System.in);

        int myReadNumber = 42;
        int summe = 0;

        while (myReadNumber != 0) {
            // read the number
            System.out.print("Type in a number: ");
            myReadNumber = myScanner.nextInt();
            System.out.println("I've understood you typed in " + myReadNumber);
            summe = summe + myReadNumber;
        }
        System.out.println("summe = " + summe);

    }
}
