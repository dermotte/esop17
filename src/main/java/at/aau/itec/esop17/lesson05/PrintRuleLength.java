package at.aau.itec.esop17.lesson05;

public class PrintRuleLength {

    public static void main(String[] args) {
        printRule(42, '*');
        System.out.println("Header 1");
        printRule();
    }

    static void printRule(int length) {
        printRule(length, '-');
    }

    static void printRule(int length, char c) {
        for (int x = 0; x < length; x++) {
            System.out.print(c);
        }
        System.out.println();
    }

    static void printRule(long length) {
        printRule((int) length);
    }

    static void printRule() {
        printRule(12, '-');
    }
}
