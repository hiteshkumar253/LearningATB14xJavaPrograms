package ex_11_While_Loop;

import java.util.Random;
import java.util.Scanner;

public class Lab0091_Guessing_Game_Program {
    public static void main(String[] args) {

        Random random = new Random();
        int numberToGuess = random.nextInt(100);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess a number between 1 and 100:");

         int attempts = 0;
         while (true) {
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid Input! Please enter a number.");
                scanner.next(); // // Discard invalid input,scanner.next() waits for the user to type something and press Enter
                continue;
            }
            int guessedNumber = scanner.nextInt();
            attempts++;

            if(guessedNumber < 1 || guessedNumber>100)
            {
                System.out.println("Please enter a number between 1 and 100");
                continue;
            }
            if(guessedNumber < numberToGuess) {
                System.out.println("Number is too low, guess again");
            }
            else if(guessedNumber > numberToGuess){
                System.out.println("Number is too high, guess again");
            }
            else
            {
                System.out.println("Correct! You guessed it right in " + attempts + " attempts");
            break;
            }
        }
    }
}







