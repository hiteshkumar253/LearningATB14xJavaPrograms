package ex_22_OOPs_AccessModifiers.police;

public class Rahul extends Cop {

    public Rahul(int bullet) {
        super(bullet);
    }

    public static void main(String[] args) {
        Cop p1 = new Cop(100);
        p1.thisDefaultF1();   //allowed under same package only
    }
}
