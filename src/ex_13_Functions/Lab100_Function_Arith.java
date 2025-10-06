package ex_13_Functions;

import java.util.Scanner;

public class Lab100_Function_Arith {
    public static void main(String[] args) {

        //create a function of sum, sub, mul, div
        // with parameter a, b (take the parameter from user)

        Scanner scanner = new Scanner(System.in);
        int a = readInt(scanner, "Enter first number: ");
        int b = readInt(scanner, "Enter second number : ");

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = mod(a, b);

        System.out.println("Addition is :" + result_sum);
        System.out.println("Subtraction is :" + result_sub);
        System.out.println("Multiplication is :" + result_mul);
        System.out.println("Division is :" + result_div);
        System.out.println("Mod is :" + result_mod);
    }

    static int readInt(Scanner scanner, String prompt) {
        System.out.println(prompt);
        if (scanner.hasNextInt()) {
            return scanner.nextInt();
        } else {
            System.out.println("Enter the Integer only.");
            System.exit(0);
            return 0;
        }
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static int sub(int a, int b) {
        return a - b;
    }

    static int div(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed");
        }
        return a / b;
    }

    static int mul(int a, int b) {
        return a * b;
    }

    static int mod(int a, int b) {
        return a % b;
    }
}

