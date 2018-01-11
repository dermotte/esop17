package at.aau.itec.esop17.lesson12;

import java.io.StringWriter;
import java.util.ArrayList;
import java.util.Comparator;

public class GenericsFoo {
    public static void main(String[] args) {
        ArrayList<CharSequence> myList = new ArrayList<>(12);
        myList.add("42");
        myList.add("13");
        myList.add("13");
        myList.add("14");
        myList.add("24");



        myList.sort(new Comparator<CharSequence>() {
            public int compare(CharSequence o1, CharSequence o2) {
                return o1.toString().compareTo(o2.toString());
            }
        });

        for (CharSequence c : myList) {
            System.out.println("c = " + c);
        }

    }
}
