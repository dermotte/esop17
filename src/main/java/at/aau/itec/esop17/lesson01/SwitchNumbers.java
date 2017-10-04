package at.aau.itec.esop17.lesson01;

public class SwitchNumbers {
    public static void main(String[] args) {
        int x = 10;
        int y = -5;
        int h;

        System.out.println(x);
        System.out.println(y);

        h = x;
        x = y;
        y = h;

        System.out.println(x);
        System.out.println(y);
    }
}
