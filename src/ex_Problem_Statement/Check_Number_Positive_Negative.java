package ex_Problem_Statement;

import java.util.Scanner;

public class Check_Number_Positive_Negative {
    public static void main(String[] args) {

                Scanner scanner = new Scanner(System.in);
                System.out.println("Enter the number: ");

                if (scanner.hasNextInt())
                {
                    int number = scanner.nextInt();

                    if (number > 0)
                    {
                        System.out.println("Positive number: " + number);
                    }
                    else if (number < 0)
                    {
                        System.out.println("Negative number: " + number);
                    }
                    else if (number == 0)
                    {
                        System.out.println("Number is zero: " + number);
                    } else
                    {
                        System.out.println("Invalid input");
                    }
                }
                else
                {
                    System.out.println("Please enter a valid integer number");
                }
            }
        }