package ex_03_Java_Literals;

public class Lab0025_Char_Literal {
    public static void main(String[] args) {

        char ch1 = 'A';  // Character literal, A to Z, a-z, 0-9, special characters
        char ch2 = 65; // ASCII value of 'A'
        char ch3 = '\u0041'; // Unicode value of 'A'
//        char ch4 = "A"; // Error: it's a string, not a character, use single quotes for char

        // Escape sequences

        char newLine = '\n'; // New line character
        char tab = '\t'; // Tab character
        char backspace = '\b'; // Backspace character
        char backslash = '\\'; // Backslash character


        System.out.println("Character 1: " + ch1);
        System.out.println("Character 2: " + ch2);
        System.out.println("Character 3: " + ch3);

        System.out.println("New Line Character:" + newLine + "This is a new line");
        System.out.println("Tab Character:" + tab + "This is a tab space");
        System.out.println("Backspace Character: ABC" + backspace + "D"); // Backspace will remove the 'C'
        System.out.println("Backslash Character: This is a backslash " + backslash);
    }
}
