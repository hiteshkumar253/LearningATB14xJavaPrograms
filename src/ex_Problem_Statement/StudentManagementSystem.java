package ex_Problem_Statement;

public class StudentManagementSystem {
// student attributes
    String name;
    int rollNo;
    String section;

// constructor to initialize student details

    StudentManagementSystem(String name, int rollNo, String section) {
        this.name = name;
        this.rollNo = rollNo;
        this.section = section;
    }

// method to print student details

    void printDetails() {
        System.out.println("Student: " + name  + ", Roll No: " + rollNo +
                ", Section: " + section);
    }
}

// main class to test StudentManagementSystem
class MainStudent {
    public static void main(String[] args) {
        StudentManagementSystem student1 = new StudentManagementSystem("Bob", 101, "A");
        student1.printDetails();
    }
}