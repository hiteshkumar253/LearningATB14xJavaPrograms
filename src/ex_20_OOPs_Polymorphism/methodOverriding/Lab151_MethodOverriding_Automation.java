package ex_20_OOPs_Polymorphism.methodOverriding;

public class Lab151_MethodOverriding_Automation {
    public static void main(String[] args) {

        CommonToAll commonToAll = new CommonToAll();
        commonToAll.openBrowser();

        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        FirefoxTC f1 = new FirefoxTC();
        f1.openBrowser();

        // Dynamic dispatching

        CommonToAll commonToAll1 = new ChromeTC();
        commonToAll1.openBrowser();

        CommonToAll commonToAll2 = new FirefoxTC();
        commonToAll2.openBrowser();


    }
}

class CommonToAll{

    void openBrowser(){
        System.out.println("Starting the IE Browser");
    }

}

class ChromeTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Chrome, Better Browser");
    }
}

class FirefoxTC extends CommonToAll{
    @Override
    void openBrowser(){
        System.out.println("Starting Firefox, Better Browser");
    }
}