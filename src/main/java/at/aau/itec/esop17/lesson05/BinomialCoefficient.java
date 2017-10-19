package at.aau.itec.esop17.lesson05;

public class BinomialCoefficient {
    public static void main(String[] args) {
        int n = 3, k=4;
        float result = factorial(n) /
                (float) (factorial(k) * factorial(Math.abs(n-k)));
        System.out.println("result = " + result);
    }

    /**
     * Recursive factorial method ...
     * @param n is the number that has ...
     * @return the factorial of n
     */
    private static int factorial(int n) {
        int result = -42;
        if (n > 1) result = n * factorial(n-1);
        else result = 1;
        return result;
    }
}
