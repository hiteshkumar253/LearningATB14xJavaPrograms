package ex_18_OOPS_Constructors;

public class Car2 {

    String model;
    int year;

    Car2(){
        model = "XXXX";
        year = 1900;
        System.out.println("DC");

    }

    Car2(String model_name){

        this.model = model_name;
    }


    // Constructor Overloading, we have same name but with different no.of parameters constructor
    Car2(String model_name,int year_created){
        this("i10");  //constructor chaining, we can call a constructor inside other constructor as well
        this.model = model_name;
        this.year = year_created;
    }

    // Constructor chaining (is a concept when one constructor is called by another constructor) is not much used in automation but should know about the concept
}
