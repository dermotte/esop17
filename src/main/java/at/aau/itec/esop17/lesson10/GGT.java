package at.aau.itec.esop17.lesson10;

public class GGT {

    public long ggtIterative(long x, long y) {
        long rest = x % y;
        while (rest != 0) {
            x = y;
            y = rest;
            rest = x % y;
        }
        return y;
    }

    public long ggtRecursive(long x, long y) {
        long rest = x % y;
        if (rest == 0)
            return y;
        else
            return ggtRecursive(y, rest);
    }

    public static void main(String[] args) {
        GGT myGGT = new GGT();
        System.out.println(myGGT.ggtIterative(31471746124l, 1212123));
        System.out.println(myGGT.ggtRecursive(31471746124l, 1212123));
    }

}
