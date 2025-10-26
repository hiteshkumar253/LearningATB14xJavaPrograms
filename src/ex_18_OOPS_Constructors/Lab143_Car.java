package ex_18_OOPS_Constructors;

public class Lab143_Car {
    public static void main(String[] args) {
    Car c1 = new Car();   // object of the Car class created and default constructor of Car class will be called automatically
    System.out.println("Name of the car is: " +c1.name);
    System.out.println("Modal of the car is: " +c1.modal);
    System.out.println("Year of manufacturing is: " +c1.year);

    LoginPage lp = new LoginPage(); // similarly default constructor of LoginPage class will be called automatically


    }
}
