package ex_23_OOPs_Super_Abstraction;

public class Lab164_Interveiw_Q {
}

interface I1{

}
interface I2{

}

class A1{

}
class A2{

}

//class Test2 extends A1,B1{}     #not allowed

class Test3 implements I1{}
class Test4 implements I1,I2{}
class Test5 extends A1 implements I1, I2{}
//class Test5 Implements I1 extends A{}      #not possible
//interface I3 extends A1 {}    # not possible