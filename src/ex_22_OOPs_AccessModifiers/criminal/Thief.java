package ex_22_OOPs_AccessModifiers.criminal;

import ex_22_OOPs_AccessModifiers.police.Cop;

public class Thief {
    public static void main(String[] args) {

        Cop c1 = new Cop(100);
//        c1.canIShoot();   // can't access the private method in another class, make public
//        c1.thisDefaultF1();   // not possible, or allowed


    }
}
