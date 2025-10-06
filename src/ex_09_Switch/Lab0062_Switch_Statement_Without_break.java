package ex_09_Switch;

import java.util.Scanner;

public class Lab0062_Switch_Statement_Without_break {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the day (1-7): ");
        if (scanner.hasNextInt()) {
            int day = scanner.nextInt();
            switch (day) {
                case 1 -> System.out.println("Monday");   // possible JDK version >13

                case 2 -> System.out.println("Tuesday");

                case 3 -> System.out.println("Wednesday");

                case 4 -> System.out.println("Thursday");

                case 5 -> System.out.println("Friday");

                case 6 -> System.out.println("Saturday");

                case 7 -> System.out.println("Sunday");

                default -> System.out.println("Enter day between 1 to 7");

            }
        }
        else
        {
            System.out.println("Invalid input. Please enter a number.");
        }
    }
}