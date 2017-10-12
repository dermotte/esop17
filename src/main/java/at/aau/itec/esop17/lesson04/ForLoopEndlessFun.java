package at.aau.itec.esop17.lesson04;

public class ForLoopEndlessFun {
    public static void main(String[] args) {
        int countRuns = 0;
        for (;;) {
            System.out.print(".");
            countRuns++;
        }
        // System.out.println("\nSchleife wurde " + countRuns + " durchaufen.");
    }
}
