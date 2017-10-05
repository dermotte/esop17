package at.aau.itec.esop17.lesson03;

import java.util.Scanner;

/**
 * Created by mlux on 05.10.2017.
 */
public class Calculator {
    public static void main(String[] args) {
        // Von System In lesen via Scanner:
        Scanner s = new Scanner(System.in);

        int myReadNumber = 0;

        while (myReadNumber>=0) {
            // read the number
            myReadNumber = s.nextInt();
            System.out.println("I've understood you typed in " + myReadNumber);
        }

    }
}
