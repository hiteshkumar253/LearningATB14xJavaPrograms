package ex_04_Operators;

public class Lab0033_Interview_Concat_Plus {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        System.out.println(a + b);  // Addition of two integers.

        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + lastName);  // Concatenation, not addition, because both are strings.

        System.out.println(a + b + firstName + lastName); // Addition first, then concatenation.
        System.out.println(firstName + lastName + a + b);  // Concatenation first, then addition as strings.

// + operator behaves differently based on the data types of the operands. Is this operator overloading?
        // No, Java does not support operator overloading in the traditional sense like C++.
    }
}
