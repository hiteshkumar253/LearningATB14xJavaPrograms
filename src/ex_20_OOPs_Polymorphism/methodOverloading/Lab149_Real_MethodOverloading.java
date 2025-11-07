package ex_20_OOPs_Polymorphism.methodOverloading;

public class Lab149_Real_MethodOverloading {
    public static void main(String[] args) {

        Home h1 = new Home();
        h1.task();
        h1.task("Bathroom");

    }
}

class Home{

    void task(){

        System.out.println("Task Cleaning Fan");
    }

    void task(String whichTask){
        System.out.println("Task" + whichTask);
    }
}