package at.aau.itec.esop17.lesson12;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.Consumer;

public class GenericsFun {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>(12);
        l.add(42);
        l.add(12);
        l.add(24);
        l.add(54);
        l.add(13);
        l.sort((o1, o2) -> o2-o1);
        l.forEach(s -> System.out.println(s));
    }
}
