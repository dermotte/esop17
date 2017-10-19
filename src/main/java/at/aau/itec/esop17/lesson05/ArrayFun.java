package at.aau.itec.esop17.lesson05;

public class ArrayFun {
    public static void main(String[] args) {
        float[] myFloats = {12, 33, 44, 23};
        float sum = 0f;
        for (float myFloat : myFloats) {
            sum += myFloat;
        }
        System.out.println(sum / myFloats.length);
    }
}
