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
        System.out.println("Enter the number:");
        int num;
        while (true) {
            if (scanner.hasNextInt()) {
                num = scanner.nextInt();
                if (num >= 0 && num <= 100) {
                    break;
                } else {
                    System.out.println("Please enter a number between 0 and 100.");
                }
            }else {
                System.out.println("Invalid number, please enter a valid number");
                scanner.next(); // clear invalid input
            }
        }

        if (num >= 90 && num <= 100) {
            System.out.println("Grade : A");
        } else if (num >= 80) {
            System.out.println("Grade : B");
        } else if (num >= 70) {
            System.out.println("Grade : C");
        } else if (num >= 60) {
            System.out.println("Grade : D");
        } else {
            System.out.println("Grade : E");
        }
    }
}
