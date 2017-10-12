package at.aau.itec.esop17.lesson04;

public class ForLoopFun {
    public static void main(String[] args) {
        int countRuns = 0;
        for (int i = 0; i <= 10; i++) {
            System.out.print(", " + i);
            countRuns++;
        }
        System.out.println("\nSchleife wurde " + countRuns + " durchaufen.");
    }
}
