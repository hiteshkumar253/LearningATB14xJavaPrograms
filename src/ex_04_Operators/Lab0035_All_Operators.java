package ex_04_Operators;

public class Lab0035_All_Operators {

    public static void main(String[] args) {

        boolean boo  = true;

        int a = 10;
        int b = 20;
        // Arithmetic Operators
        System.out.println(a + b);  //30
        System.out.println(a - b);  //-10
        System.out.println(a * b);  //200
        System.out.println(b / a);  //2
        System.out.println(a > b);  //false
        System.out.println(a < b);  //true
        System.out.println(a >= b); //false
        System.out.println(a <= b); //true
        System.out.println(a == b); //false
        System.out.println(a != b); //true

        // Compound Assignment Operators
        int age = 24    ;
        age += 5;  // age = age + 5
        System.out.println(age); //29
        age -= 5;  // age = age - 5
        System.out.println(age); //24
        age *= 2;  // age = age * 2
        System.out.println(age); //48
        age /= 2;  // age = age / 2
        System.out.println(age); //24
    }
}
