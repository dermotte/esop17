package at.aau.itec.esop17.lesson04;

public class RandomNumberXorShift {
    public static void main(String[] args) {
        // set a maximum value:
        int max = 100;
        // get the current time:
        long randNumber = System.nanoTime();
        // xorshift:
        randNumber ^= (randNumber << 21);
        randNumber ^= (randNumber >>> 35);
        randNumber ^= (randNumber << 4);
        int out = (int) randNumber % max;
        out = (out < 0) ? -out : out;
        System.out.println(out);
    }
}
