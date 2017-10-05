package at.aau.itec.esop17.lesson03;

/**
 * Created by mlux on 05.10.2017.
 */
public class SimpleLoop {
    public static void main(String[] args) {

        byte x = 0;
        byte one = 1;
        while (true) {
            System.out.println(x);
            x = (byte) (one + x);
        }
    }
}
