package ex_05_TypeCasting;

public class Lab0043_TypeCasting_0 {

    public static void main(String[] args) {

        byte b = 10;
        int i = b; // valid syntax -> Implicit casting
        int a = (int) b;  // explicit casting - widening , not required, it's done by JVM automatically
        System.out.println(i);

//        int a1 = 300;
//        byte b1 = a1; //java: incompatible types: possible lossy conversion from int to byte

    }

}
