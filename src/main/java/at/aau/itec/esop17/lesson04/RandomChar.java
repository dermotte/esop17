package at.aau.itec.esop17.lesson04;

public class RandomChar {
    public static void main(String[] args) {
        for (int i=0; i<10; i++) {
            // ASCII table A -> 65, Z -> 90
            char c = (char) ((System.nanoTime()%26)+65);
            System.out.print(c);
        }
    }
}
