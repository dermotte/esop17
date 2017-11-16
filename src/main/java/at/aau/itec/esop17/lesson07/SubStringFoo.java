package at.aau.itec.esop17.lesson07;

public class SubStringFoo {
    public static void main(String[] args) {
        String s = new String("Hello World!");
        System.out.println(s.substring(1, 5).toUpperCase());

        System.out.println(s.lastIndexOf('o'));

        System.out.println("---------------");

        String fileName = "slides.pptx";
        int suffixIndex = fileName.lastIndexOf('.');
        System.out.println(fileName.substring(0, suffixIndex) + ".pdf");

        System.out.println("---------------");
        String foo = "foo", bar = "bar";

        int r = bar.compareTo(foo);
        System.out.println("r = " + r);

    }
}
