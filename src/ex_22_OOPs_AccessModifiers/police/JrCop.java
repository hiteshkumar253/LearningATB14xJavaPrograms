package ex_22_OOPs_AccessModifiers.police;

public class JrCop {
    public static void main(String[] args) {

        Cop c1 = new Cop(100);
        c1.canIShoot();  // can's access since canISoot method is private
    }
}
