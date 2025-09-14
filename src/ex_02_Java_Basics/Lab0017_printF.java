package ex_02_Java_Basics;

public class Lab0017_printF {

    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        System.out.println(a);
        System.out.println(b);

        System.out.print(a);
        System.out.print(b);

        System.out.printf("The value of a is %d and the value of b is %d", a, b);

        // %d -> integer, byte, short, long
        // %f -> float, double
        // %c -> character
        // %s -> string
    }
}
