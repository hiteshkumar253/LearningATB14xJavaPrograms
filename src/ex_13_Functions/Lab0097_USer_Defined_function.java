package ex_13_Functions;

import java.util.Scanner;

public class Lab0097_USer_Defined_function {
    public static void main(String[] args) {

        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter the number a :");
        int a = scanner1.nextInt();

        Scanner scanner2 =  new Scanner(System.in);
        System.out.println("Enter the number b :");
        int b = scanner2.nextInt();

        int result1 = sum_of_two_num(a ,b);
        System.out.println(result1);                      //a+b

        int result2 = sum_of_two_num(10, 40);
        System.out.println(result2);                      //10+40

        sum_of_two_num();    // Hi, there
    }

    static int sum_of_two_num(int a, int b){
    return a+b;
    }

    static void sum_of_two_num(){
        System.out.println("Hi, there");
    }
}
