package ex_08_if_condition;

import java.util.Scanner;

public class Lab0060_If_ElseIf_Else {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = scanner.nextInt();

        if(age <= 0) {
            System.out.println("Invalid Age, Please Enter a valid Age.");
        } else if (age <18 ) {
            System.out.println("Age is less than 18 and You are not Eligible to Vote");
        }
        else
            System.out.println("You are above or equal to 18, hence eligible to Vote. Congratulations!!!!");
    }

    }

