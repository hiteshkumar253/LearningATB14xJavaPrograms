package ex_17_OOPs;

public class Lab140_Cats_OOPS {
    public static void main(String[] args) {

        Cat c1;
        Cat c2;
        Cat c3 = new Cat();
        Cat c4 = new Cat("Lucy");
        Cat c5 = new Cat("Spice");
        Cat c6 = new Cat("Mirchi");
        new Cat();
        System.out.println(c3.name);
        System.out.println(c4.name);
        System.out.println(c5.name);
        System.out.println(c6.name);
        c3.running();
        c4.running();
        c5.running();
        c6.running();
    }

}

class Cat{
    String name;    // instance variable
    Cat(){
        name = "Kitty";
    }
    Cat(String nameParam){
        this.name = nameParam;
    }

    void  running(){
        System.out.println("Who is running -> " + this.name);


    }
}
