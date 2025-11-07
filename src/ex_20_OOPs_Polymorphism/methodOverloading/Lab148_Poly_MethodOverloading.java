package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab148_Poly_MethodOverloading {
    public static void main(String[] args) {

        MathOperations op = new MathOperations();
        System.out.println(op.add(10,20));
        System.out.println(op.add(20,30,40));
        System.out.println(op.add(20.3, 40));
        System.out.println(op.add("Hitesh", "Kumar"));

    }
}

class MathOperations{
    int add(int a, int b){
        return a + b;
    }
    int add( int a, int b, int c){
    return a + b + c;
    }
    double add(double a, double b){
        return a + b;
    }
    String add(String a, String b){
        return a + b;
    }
}