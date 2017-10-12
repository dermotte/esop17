package at.aau.itec.esop17.lesson04;

public class HarmonicMean {
    public static void main(String[] args) {
        int max = 512;
        float sum = 0;
        for (int i = 0; i < max; i++) {
            sum += 1f/(i+1);
        }
        System.out.println("hm = " + sum);
    }
}
