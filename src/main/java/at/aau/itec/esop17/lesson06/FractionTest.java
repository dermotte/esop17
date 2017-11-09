package at.aau.itec.esop17.lesson06;

public class FractionTest {
    public static void main(String[] args) {
        Fraction f1 , f2;
        f1 = new Fraction(3, 4);
        f2 = new Fraction();

        System.out.println(f1.toString());

        Fraction f3 = f1.multClone(f2);
        System.out.println("f3 = " + f3.toString());

        System.out.println(f1.toString());

        f1.mult(f2);

        System.out.println(f1.toString());

    }
}
