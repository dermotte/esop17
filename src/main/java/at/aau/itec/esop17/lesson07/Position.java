package at.aau.itec.esop17.lesson07;

public class Position {
    double x, y, z;


    public Position(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void bringToFront() {
        this.z = 0d;
    }

    public double getLength() {
        return x * x + y * y + z * z;
    }
}
