package at.aau.itec.esop17.lesson04;

public class PrintMulTab {
    public static void main(String[] args) {
        int numberOfRuns = 10;
        // outer:
        for (int i = 0; i <= numberOfRuns; i++) {
            for (int j = 0; j <= numberOfRuns; j++) {
                // if (i==3) break outer;
                System.out.print("\t" + i * j);
            }
            System.out.println();
        }
    }
}
