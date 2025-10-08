package ex_14_Strings;

public class Lab103_String_Immutable_example {
    public static void main(String[] args) {

        String s1 = "Hello";
        System.out.println(s1);
        s1 = s1.concat("World");   // reassigning concatenated string to s1
        System.out.println(s1);

        // keep in mind 2 strings will be present in string constant pool
        // Hello and HelloWorld
    }
}
