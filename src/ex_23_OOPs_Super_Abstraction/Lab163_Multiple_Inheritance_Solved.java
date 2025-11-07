package ex_23_OOPs_Super_Abstraction;

import java.net.InterfaceAddress;

public class Lab163_Multiple_Inheritance_Solved {
}

class child1 implements Father1,Father2{

    public void money(){

        System.out.println("Child Money!");
    }
}
interface Father1{
    void money();
}

interface Father2{
    void money();
}