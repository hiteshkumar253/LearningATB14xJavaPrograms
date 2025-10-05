package ex_Problem_Statement;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a non-negative integer: ");

        int number = scanner.nextInt();

        if (number < 0)
        {
            System.out.println("Factorial is not defined for negative numbers.");
        }
        else
        {
            int fact = 1;
            for (int i = 1; i <=number ; i++)  // for(int i = number; i>=1; i--)
            {
                fact = fact * i;
            }
            System.out.println("Factorial of " + number + " is: " + fact);
        }

    }
}
