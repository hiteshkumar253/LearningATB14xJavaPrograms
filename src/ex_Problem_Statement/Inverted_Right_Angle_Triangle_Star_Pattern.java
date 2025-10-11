package ex_Problem_Statement;

import java.util.Scanner;

public class Inverted_Right_Angle_Triangle_Star_Pattern {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = scanner.nextInt();

        for (int row = 0; row < num ; row++)
        {
            for (int col = num-1; col >= row ; col--)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
