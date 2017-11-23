package at.aau.itec.esop17.lesson08;

public class StackTest {
    public static void main(String[] args) {
        Stack s = new Stack(4);
        if (s.push(42d)) System.out.println("42 on stack");;
        if (s.push(3d)) System.out.println("3 on stack");
        if (s.push(4d)) System.out.println("4 on stack");
        if (s.push(5d)) System.out.println("5 on stack");
        if (s.push(6d)) System.out.println("6 on stack");
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());
    }
}
