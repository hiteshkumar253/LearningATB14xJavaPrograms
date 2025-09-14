package ex_04_Operators;

public class Lab0029_Unary_Operator {
    public static void main(String[] args) {
        int a = 10;
        int a1 = +10; // unary plus, indicates positive value
        int b1 = -110; // unary minus, negates the value
        int result = a1+b1; // result is 0 (10 + -10)
        System.out.println(result); // 0

        int b = -1;  // b is -1
        b = b+1;
        System.out.println(b);   // 00
    }
}
