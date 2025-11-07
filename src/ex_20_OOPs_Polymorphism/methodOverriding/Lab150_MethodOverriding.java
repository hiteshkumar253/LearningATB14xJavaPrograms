package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab150_MethodOverriding {
    public static void main(String[] args) {

        //Runtime polymorphism

        Son s1 = new Son();
        s1.home();   // jiska object banega usi ka home call hoga

        Father f1 = new Father();
        f1.home();   // jiska object banga usi ka home call hoga

        Father f2 = new Son();   //dynamic dispatching
        f2.home();   // jiska object banega usi ka home call hoga

//        Son s2 = new Father(); ? // When father is gettign born, child reference cannot be given to

    }
}

class Father {
    void home() {
        System.out.println("Father 2BHK");
    }
}
class Son extends Father{
    @Override
    void home() {
        System.out.println("Son 3BHK");
    }
    }
