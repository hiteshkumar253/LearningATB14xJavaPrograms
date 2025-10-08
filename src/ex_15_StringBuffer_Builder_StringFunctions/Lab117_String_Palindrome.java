package ex_15_StringBuffer_Builder_StringFunctions;

import java.util.Scanner;

public class Lab117_String_Palindrome {
    public static void main(String[] args) {
        // madam -> reverse -> madam
        // naman -> naman
        // user_input == reverse(user_input)
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string for checking palindrome or not: ");
        String input =scanner.next();

//        String input = "Hitesh";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }


        if (reversed.equalsIgnoreCase(input)) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
    }
}
