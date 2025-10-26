package ex_17_OOPs;

public class Lab138_OOPs {
    public static void main(String[] args) {

        Person p1 = new Person();   //p1 is refrence to the object
        p1.name = "Somya";

        Person p2 = new Person();  //p2 is also a reference to the another object
        p2.name = "Yogesh";

        new Person();  // third object but no reference this time
    }
}
