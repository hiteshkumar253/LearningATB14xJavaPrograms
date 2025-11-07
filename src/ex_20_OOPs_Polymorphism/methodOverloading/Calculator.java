package ex_20_OOPs_Polymorphism.methodOverloading;

public class Calculator {
    public static void main(String[] args) {
        Calc c1 = new Calc();
        System.out.println(c1.add(100,4)); //int add()
        System.out.println(c1.add(5,7,9)); //int add() with three argument
        System.out.println(c1.add(100.4,4)); //double add()
        System.out.println(c1.add(100l,4)); //long add()
    }

}

class Calc{
    int add(int a, int b){
        return a+b;
    }
    int add(int a, int b, int c){
        return a+b+c;
    }

    double add(double a, double b){
        return a+b;
    }
    long add(long a, int b){
        return a+b;
    }
}