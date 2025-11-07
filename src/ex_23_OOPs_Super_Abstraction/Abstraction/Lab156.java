package ex_23_OOPs_Super_Abstraction.Abstraction;

public class Lab156 {
    public static void main(String[] args) {
        // Car
        Car tesla = new Car(300);
        tesla.drive();

    }
}

class Vehicle{
    public int maxSpeed = 180;

    void noTest() {
        System.out.println("Empty!");
    }

    Vehicle(){
        System.out.println("Parent Default Const");
    }

    Vehicle(int a ){
        System.out.println("Param Con");
    }
    Vehicle(int a, int b ){
        System.out.println("Param Con");
    }

    // Method Overloading - Same, same name function with different arguments.
    void message(){
        System.out.println("No Return, No Argument");
    }

    void message(int a){
        System.out.println("PC - arguemnt");
    }

    void drive(){
        System.out.println("Vehicle Parent");
    }
}

class Car extends Vehicle{

    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("Child Parameterize Constructor Car");
    }

    void test(){}

    @Override
    void drive() {
        System.out.println("Over ridden the Vehicle");
        System.out.println("Parent's max speed "+ super.maxSpeed);
        System.out.println("Child's max speed " +this.maxSpeed);
        super.noTest();
        this.test();
    }
}