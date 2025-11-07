package ex_23_OOPs_Super_Abstraction;

public class Lab158_Private {

    public static void main(String[] args) {
        CAB cab = new CAB();
        cab.display();
    }
}

class XYZ {
    XYZ() {
    }

      protected int my_gold = 10;           //class has a protected member variable
//    private int my_gold = 10;             //class has a private member variable
}

class CAB extends XYZ{
    void display(){
        System.out.println(super.my_gold);  //can we access my_gold? absolutely yes if it's protected, not private
    }
}


//A protected member can be accessed within the same package by any class
//Can be accessed in subclasses (child classes), even if those subclasses are in different packages.
//Cannot be accessed by non-subclass classes outside the package.