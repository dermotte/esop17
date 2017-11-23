package at.aau.itec.esop17.lesson08;

public abstract class DataStructure {
    double[] data;

    public DataStructure(int size) {
        data = new double[size];
    }

    public abstract int size();
}
