package at.aau.itec.esop17.lesson06;

/**
 * Bruchrechnen mit Java
 */
public class Fraction {
    long zaehler, nenner;

    public Fraction() {
        zaehler = 0;
        nenner = 1;
    }

    public Fraction(int zaehler, int nenner) {
        this.zaehler = zaehler;
        this.nenner = nenner;
    }

    public void mult(Fraction f) {
        zaehler = zaehler * f.zaehler;
        nenner = nenner * f.nenner;
    }

    public void multBad(Fraction f) {
        f.zaehler = zaehler * f.zaehler;
        f.nenner = nenner * f.nenner;
    }

    public Fraction multClone(Fraction f) {
        Fraction result  = new Fraction(0, 0);
        result.zaehler = zaehler * f.zaehler;
        result.nenner = nenner * f.nenner;
        return result;
    }

    public void add(Fraction f) {
        zaehler = zaehler * f.nenner + f.zaehler * nenner;
        nenner = nenner*f.nenner;
    }

    public String toString() {
        return zaehler + "/" + nenner;
    }
}
