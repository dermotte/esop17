package at.aau.itec.esop17.lesson12;

import java.util.Comparator;

public class MyComparator<T> implements Comparator<T> {
    @Override
    public int compare(T o1, T o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
