package ex_19_OOPs_Part2.OOPs_01_Inheritance.multiLevelInheritance;

public class Lab146_MultiLevel{
    public static void main(String[] args) {
        System.out.println("----Son's Object----");
        Son s = new Son();
        s.home();
        s.bhk3();
        s.gf();
        s.extra();

        System.out.println("---Father's Object---");
        Father f = new Father();
        f.extra();
        f.home();
        f.gf();

        System.out.println("---GrandFather's Object---");
        GrandFather gf = new GrandFather();
        gf.gf();
        gf.home();

        //Dynamic Dispatch
        GrandFather gf1 = new Son();
        Father f1 = new Son();
//        Son s1 = new GrandFather();   // not possible
//        Son s2 = new Father();    // not possible

    }
}

