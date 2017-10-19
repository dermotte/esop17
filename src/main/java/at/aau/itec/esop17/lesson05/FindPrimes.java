package at.aau.itec.esop17.lesson05;

public class FindPrimes {
    public static void main(String[] args) {
        for (long i=2; i< 100; i++) {
            if (isPrime(i))
                System.out.println(i);
        }
    }

    static boolean isPrime(long primeCandidate) {
        boolean isPrime = true;
        for (long i = 2; i <= Math.sqrt(primeCandidate); i++) {
            if (primeCandidate % i == 0) {// primeCandidate is no more prime candidate
                isPrime = false;
            }
        }
        // if (isPrime) System.out.println(primeCandidate + " is prime");
        // else System.out.println("not prime");
        return isPrime;
    }
}
