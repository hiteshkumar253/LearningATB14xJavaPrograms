// Relational Operators: >, <, >=, <=, ==, !=
// Used to compare two values and return a boolean result (true or false)
// Example: a > b, a < b, a >= b, a <= b,
// a == b, a != b
// Note: Use '==' for comparison, not '=' which is for assignment
package ex_04_Operators;

public class Lab0031_Relational_Operator {

    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a > b);  // false
        System.out.println(a < b);  // true
        System.out.println(a >= b); // false
        System.out.println(a <= b); // true
        System.out.println(a == b); // false
        System.out.println(a != b); // true
    }
}
