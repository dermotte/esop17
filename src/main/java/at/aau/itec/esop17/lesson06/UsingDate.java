package at.aau.itec.esop17.lesson06;

import sun.java2d.pipe.SpanShapeRenderer;

public class UsingDate {
    public static void main(String[] args) {
        SimpleDate x;
        x = new SimpleDate();
        x.day = 1;
        x.month = 12;
        x.year = 2014;
        SimpleDate y = x;
        System.out.println(x == y);
    }
}

class SimpleDate {
    int day, month, year;
}
