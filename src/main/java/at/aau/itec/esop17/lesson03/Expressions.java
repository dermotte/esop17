package at.aau.itec.esop17.lesson03;

/**
 * Created by mlux on 05.10.2017.
 */
public class Expressions {
    public static void main(String[] args) {
            int x = 10;
            if (!(x < 10)) {
                System.out.println("x larger than 10");
                if (x == 10) System.out.println("x=10");
            } else if (true) System.out.println("x is not larger than 10.");

            boolean bedingung = !true;
            if (bedingung) System.out.println("yes");
        int z = 10, y = 12;
        x = z & y;
    }
}
