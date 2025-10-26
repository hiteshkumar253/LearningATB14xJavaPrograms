package ex_17_OOPs;

public class Lab137_P2 {
    public static void main(String[] args) {

        ATBx amit = new ATBx();
        // Class-  ATBx
        // Object Ref - amit
        // Object -> new ATBx()

        amit.name = "Amit Sharma";
        System.out.println(amit.name);  // will print Amit Sharma
        amit.doAssignment();  // this is empty so nothing happens


        Baby b1 = new Baby();
        Baby b2 = new Baby();
        Baby b3 = new Baby();
    }
}
