// This code demonstrates that a Java class can have multiple main methods with different signatures.
// However, only the standard main method with the signature `public static void main(String[] args)`
// will be recognized as the entry point when the program is executed.
// Other main methods with different parameter types will not be called automatically.
// They can be called manually from within the standard main method if needed.
// However, this example serves to illustrate method overloading in Java.

package ex_02_Java_Basics;

public class Lab009_MultiMain {

    public static void main(String[] args) {
        System.out.println("Hello from Lab009_MultiMain");
    }

    public static void main(String args) {
        System.out.println("Hello World");
    }

    public static void main(int args) {
        System.out.println("Hello my friend");
    }
}
