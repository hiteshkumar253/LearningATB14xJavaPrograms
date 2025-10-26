package ex_18_OOPS_Constructors;

public class Car {
    String name;
    int year;
    String modal;

    //Default Constructor

    Car(){
        name = "Unknown Car";
        modal = "XXXX";
        year = 0;
        System.out.println("I am a default constructor and will be called as soon as the the object of the class Car is created");

    }
}
