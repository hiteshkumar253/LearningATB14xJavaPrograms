package ex_24_Static;
//static block is used to initialize the static data members
//it is executed before main method at the time of class loading
//it is executed only once at the time of class loading

public class Lab168_Static_SIB {
    public static void main(String[] args) {
        A a = new A(); // what will happen on object creation?  static block will be called automatically
    }

}


class A {
    static {                        // static initialization block
        System.out.println("Called only Once when Class is loaded");
        System.out.println("You can write a code reading a excel, file, , database file");
    }

    static int a = 10;

    static void m1() {
        System.out.println("static functions");
    }
}