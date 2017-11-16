package at.aau.itec.esop17.lesson07;

public class PositionStatic {
    double x, y, z;

    static int instanceCount = 0;

    static {
        instanceCount = 0;
    }


    public PositionStatic() {
        this.x = 0d;
        this.y = 0d;
        this.z = 0d;

        instanceCount++;
    }

    public PositionStatic(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;

        instanceCount++;
    }
}
