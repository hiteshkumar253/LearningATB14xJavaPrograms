package ex_04_Operators;

public class Lab0032_Logical_Operator {
    public static void main(String[] args) {

        boolean a = true;
        System.out.println(!a);  // Output: false

        boolean b = true;
        System.out.println(!!b);  // Output: true

        boolean c = true || false;
        System.out.println(c);  // Output: true

        boolean c1 = false && true;
        System.out.println(c1);  // Output: false
    }
}
