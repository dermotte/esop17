package at.aau.itec.esop17.lesson05;

public class RandomCharacter {
    public static void main(String[] args) {
        char[] letter = "abcdefghjklmnopqrstuvwxyz".toCharArray();
        for (int i = 0; i< 8; i++) {
            long randomNumber = System.nanoTime();
            int randomNumberInt = ((int) randomNumber)%letter.length;
            System.out.print(letter[randomNumberInt]);
        }
    }
}
