// Non-Primitive Literal Example
// Demonstrates the use of non-primitive literals in Java.
// Non-primitive literals include String literals and Array literals.
// Non-primitive literals can be further broken down.
package ex_03_Java_Literals;

public class Lab0026_Non_Primitive_Literal {

    public static void main(String[] args) {

            String name = "John";  // String literal, a sequence of characters, like 'J,' 'o,' 'h,' 'n'
            System.out.println(name);

            int[] numbers = {1, 2, 3};  // Array literal, like [1, 2, 3]
            for (int number : numbers) {
                System.out.println(number);
            }
    }
}
