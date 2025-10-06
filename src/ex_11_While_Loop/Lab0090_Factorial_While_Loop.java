package ex_11_While_Loop;

import java.util.Scanner;

public class Lab0090_Factorial_While_Loop {
    public static void main(String[] args) {

        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter the +ve integer; ");

        if(!scanner.hasNextInt()){
            System.out.println("Invalid choice, please enter +ve integer to have a factorial");
        }else {
            int num = scanner.nextInt();
            int fact = 1;
            if (num == 0)
            {
              System.out.println("Factorail is 1");
            }
            if (num < 0 || num > Integer.MAX_VALUE){
                System.out.println("Out of bound");
            }
            int i = 1;
            while (i <= num){
                fact = fact * i;
                i++;
            }
            System.out.println(fact);
        }
    }
}
