package ex_19_OOPs_Part2.OOPs_01_Inheritance.singleInheritance;

public class Lab144_SingleInheritance {
    public static void main(String[] args) {
        System.out.println("-----Using Son's Object-----");
        Son s1 = new Son();  // created Son's object and can access bot father and sons attribute and methods
        System.out.println("Father gold_f: " +s1.gold_f);
        s1.bhk2();
        s1.bhk3();

        System.out.println("-----Using Father's Object-----");
        Father f1 = new Father();
        f1.bhk2();
//        f1.bhk3();?    -> not possible
        System.out.println("Father gold_f: " +f1.gold_f);
    }
}
