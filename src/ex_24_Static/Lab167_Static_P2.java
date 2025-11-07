package ex_24_Static;

public class Lab167_Static_P2 {
    public static void main(String[] args) {
        ATB s1 = new ATB();  // Object Creation
        s1.phone_np = 123456;  // Accessing Instance Variable
        s1.name = "John";   // Accessing Instance Variable

        ATB s2 = new ATB();  // Object Creation
        s2.phone_np = 789012;   // Accessing Instance Variable
        s2.name = "Alice";      // Accessing Instance Variable

        s1.display();   // Accessing Instance Variable
        s2.display();   // Accessing Instance Variable

        ATB.markAttendance();  // Accessing Static Method using Class Name
    }
}
class ATB {

    int phone_np;
    String name;

    static String course_name = "ATB";

    static void markAttendance() {
        System.out.println("Mark Attendance");
//        System.out.println(this.phone_np);
    }

    void display() {
        System.out.println(this.phone_np + this.name + course_name);  // Accessing Instance Variable and Static Variable
        // non static member/function can access the static value, but not vice versa
    }
}