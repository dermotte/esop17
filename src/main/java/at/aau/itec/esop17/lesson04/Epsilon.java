package at.aau.itec.esop17.lesson04;

public class Epsilon {
    public static void main(String[] args) {
        float f, g;
        f = 23e-45f;
        g = 24e-45f;

        if (f-g <1E-50) {
            System.out.println("Wir nehmen gleichheit an ...");
        }
    }
}
