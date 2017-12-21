package at.aau.itec.esop17.lesson11;

import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class SortingFun {
    static String[] firstNames = "Franz Rudi Otto Maria Anna Karin Tobias Lukas Christa Hanna Lisa".split(" ");
    static String[] lastNames = "Huber Müller Maier Muster Kofler Kreiner Wagner Trummer Gruber Haberl Maier".split(" ");

    public static void main(String[] args) {
        LinkedList students = new LinkedList();

        for (int i = 0; i < firstNames.length; i++) {
            students.add(new Student(firstNames[i], lastNames[i], (int) (Math.random()*1000000)));
        }

        students.forEach(new MyConsumer());

        Collections.sort(students);
        System.out.println("----");
        students.forEach(new MyConsumer());
    }


}

class MyConsumer implements Consumer {
    @Override
    public void accept(Object o) {
        System.out.println(o);
    }
}