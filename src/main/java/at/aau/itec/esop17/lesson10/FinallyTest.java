package at.aau.itec.esop17.lesson10;

public class FinallyTest {
    public static void main(String[] args) {
        call1();
        System.out.println(call2());
    }

    private static int call1() {
        try {
            System.out.println("Elvis entered the building");
            return -1;
        } catch (Exception e) {

        }
        System.out.println("Elvis left the building");
        return 0;
    }

    private static int call2() {
        try {
            System.out.println("The King entered the building");
            return -1;
        } catch (Exception e) {

        } finally {
            System.out.println("The King left the building");
        }
        return 0;
    }
}
