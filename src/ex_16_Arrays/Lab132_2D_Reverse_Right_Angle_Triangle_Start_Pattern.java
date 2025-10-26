package ex_16_Arrays;

import java.util.Scanner;

public class Lab132_2D_Reverse_Right_Angle_Triangle_Start_Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the n for the pattern: ");
        int n = scanner.nextInt();

// Inverted Right Angle Triangle
//         *
//        **
//       ***
//      ****
//     *****

        for (int i = 1; i <=n ; i++)
        {
            for (int j = n-1; j >= i ; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++)
            {
                System.out.print("*");
            }
            System.out.println();

        }
    }
}
