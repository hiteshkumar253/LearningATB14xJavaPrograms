package ex_15_StringBuffer_Builder_StringFunctions;

public class Lab113_SBuilder {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder("Hello");
        stringBuilder.append(" World"); // Hello World
        stringBuilder.reverse(); // dlroW olleH
        System.out.println(stringBuilder);
    }
}
