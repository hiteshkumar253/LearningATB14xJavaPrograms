package ex_26_Wrapper_Classes;

public class Lab180_Wrapper {
    public static void main(String[] args) {
        int a= 10;
        Integer b = a;  // AutoBoxing, primitive -> wrapper. JVM wil do it.
        System.out.println(b.intValue());
        System.out.println(b);
        System.out.println(a);

        // UnBoxing (wrapper -> primitive)
        Integer aa = 43;
        int a1 = aa; // UNBOXING,
        System.out.println(a1);

    }
}
