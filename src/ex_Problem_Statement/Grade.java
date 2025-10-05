//Write a program that calculates and displays the letter grade for a given numerical score
// (e.g., A, B, C, D, or F) based on the following grading scale:
//A: 90-100
//B: 80-89
//C: 70-79
//D: 60-69
//F: 0-59

package ex_Problem_Statement;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number :");

        if(!scanner.hasNextInt())
            System.out.println("Enter a valid integer value");
        else {
            int number = scanner.nextInt();
            if (number < 0 || number > 100) {
                System.out.println("Enter a valid number between 0-100");
            }
            else if (number >= 90) {
                System.out.println("Grade A");
            }
            else if (number >= 80) {
                System.out.println("Grade B");
            }
            else if (number >= 70) {
                System.out.println("Grade C");
            }
            else if (number >= 60) {
                System.out.println("Grade D");
            }
            else{
                System.out.println("Grade F");
            }
        }
    }
}
