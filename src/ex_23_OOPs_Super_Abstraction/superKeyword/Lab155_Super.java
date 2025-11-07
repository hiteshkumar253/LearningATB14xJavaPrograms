package ex_23_OOPs_Super_Abstraction.superKeyword;

public class Lab155_Super {
    public static void main(String[] args) {
        Son son =   new Son();
        son.newHome();
    }

}

class Father{
    Father() {
        System.out.println("DC Father");
    }

    int gold = 10;

    void home() {
        System.out.println("Home Father");
    }

}

class Son extends Father {
    Son(){
        super();
    }
    int gold_c = 100;
    void bike(){
        System.out.println("Child bike");
    }

    void newHome() {
        System.out.println(super.gold);
        super.home();
        this.bike();
        System.out.println(this.gold_c);
    }
}
