package ex_08_if_condition;

import java.util.Scanner;

public class Lab0058_If {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Age : ");
        int age = scanner.nextInt();
        if (age >= 18 ){
        System.out.println("can vote");
    }
}}
