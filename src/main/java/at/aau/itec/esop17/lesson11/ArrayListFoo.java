package at.aau.itec.esop17.lesson11;

import java.util.*;

public class ArrayListFoo {
    public static void main(String[] args) {
        // New ArrayList with an initial size of 12 elements:
        ArrayList arrayList = new ArrayList(12);
        // Now add some random int values to the list:
        for (int i = 0; i < 40; i++) {
            arrayList.add((int) (Math.random()*100000));
        }
        // Use an iterator to visit every element:
        Iterator iterator = arrayList.iterator();
        while (iterator.hasNext()) {
            Object next = iterator.next();
            System.out.println(next);
        }
    }
}
