package at.aau.itec.esop17.lesson04;

public class FindPrimes {
    public static void main(String[] args) {
        long primeCandidate = 984136491;
        boolean isPrime = true;
        for (long i = 2; i < Math.sqrt(primeCandidate); i++) {
            if (primeCandidate % i == 0) {// primeCandidate is no more prime candidate
                isPrime = false;
            }
        }
        if (isPrime) System.out.println("prime");
        else System.out.println("not prime");
    }
}
