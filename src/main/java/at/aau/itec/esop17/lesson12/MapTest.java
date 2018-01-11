package at.aau.itec.esop17.lesson12;

import java.util.HashMap;

public class MapTest {
    public static void main(String[] args) {
        HashMap<String, String> matr2stud = new HashMap<>(1024*1024);
        matr2stud.put("12345678A", "Max Mustermann");
        matr2stud.put("12345678B", "Max Mustermann");
        matr2stud.put("12345678C", "Max Mustermann");
        matr2stud.put("12345678D", "Max Mustermann");

        for (String key : matr2stud.keySet()) {
            System.out.println(key + " " + matr2stud.get(key));
        }
    }
}
