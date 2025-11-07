package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab159_Abstract {
    public static void main(String[] args) {

        Son s1 = new Son();
        s1.Loan50k();   //abstract method (implemented in Son)
        s1.loan10k();   //normal (concrete) method inherited from AmitFather
    }
}

abstract class AmitFather{          //cannot be instantiated directly. can contain both abstract and concrete methods.
    abstract void Loan50k();    // abstract method, must be implemented by any subclass
    void loan10k(){             // concrete method, so the subclass inherits it as-is.
        System.out.println("Given");
    }
}

class Son extends AmitFather{

    @Override
    void Loan50k() {    //Provides a concrete implementation of the abstract method Loan50k()
        System.out.println("Ok, I am Amit, I will pay the Father's Loan of 50k");

    }
}