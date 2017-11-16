package at.aau.itec.esop17.lesson07;

public class ParseNumber {
    public static void main(String[] args) {
        String my42 = "42";
        int result = (int) Double.parseDouble(my42) + 2;
        System.out.println(result);
    }
}
