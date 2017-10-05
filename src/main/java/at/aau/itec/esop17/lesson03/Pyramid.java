package at.aau.itec.esop17.lesson03;

public class Pyramid {
    public static void main(String[] args) {
        int x = 10;
        while (x >0) {
            // erste Zeile
            int y = 0;
            while (y < x) { // 10x
                 System.out.print('*');
                 y++;
            }
            System.out.print('\n');
            x--;
        }
    }
}
