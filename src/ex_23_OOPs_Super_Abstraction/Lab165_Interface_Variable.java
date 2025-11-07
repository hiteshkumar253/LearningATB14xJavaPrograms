package ex_23_OOPs_Super_Abstraction;

public class Lab165_Interface_Variable {
    public static void main(String[] args) {
    Dutta d1 = new Dutta();
    d1.display();
    }
}

interface Pramod {
 int a = 10;   //by default interface are public static final
 void display();
 }

class Dutta implements Pramod{
    int aa=20;
    @Override
    public void display(){
        System.out.println(a);   // can be accessed directly
        System.out.println(Pramod.a); //can be accessed by Interface name
//        System.out.println(super.a); // is this valid?  NO, super cannot be used in interface variable access
        System.out.println(this.aa);

    }
}

class Somya implements TTA{

    @Override
    public void practice() {

    }

}
class Pramod1 implements TTA{

    @Override
    public void practice() {

    }

}
interface TTA{
    void practice();
}


class Pramod_Mentor implements TTA_Mentor{

    @Override
    public void teach() {

    }
}

class Dipak implements TTA_Mentor{

    @Override
    public void teach() {

    }
}

interface TTA_Mentor{
    void teach();
}