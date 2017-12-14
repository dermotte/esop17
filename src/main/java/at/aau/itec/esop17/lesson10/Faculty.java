package at.aau.itec.esop17.lesson10;

public class Faculty {
    public static long faculty(long n) {
        if (n>1)
            return n * faculty(n-1);
        else
            return 1;
    }

    public static void main(String[] args) {
        System.out.println(faculty(323423));
    }
}
