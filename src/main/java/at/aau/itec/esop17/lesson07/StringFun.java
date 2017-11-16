package at.aau.itec.esop17.lesson07;

public class StringFun {
    static int i = 0;
    public static void main(String[] args) {
        String helloWorld = new String("Hello World!");
        System.out.println(helloWorld);
        System.out.println(helloWorld.charAt(2));
        char[] buffer = new char[3];
        int startPosition = 0;
        helloWorld.getChars(startPosition, 3, buffer, 0);
        System.out.println("startPosition = " + startPosition);
        System.out.println(buffer);

        System.out.println("----------------");
        String myString = "ESOP ist super";
        char[] f = myString.toCharArray();
        String result = new String("");
        for (i = 0; i < f.length; i++) {
            result = f[i] + result; // here a "new" is hidden
        }
        System.out.println(result);
    }
}
