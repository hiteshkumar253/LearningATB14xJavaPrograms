package ex_17_OOPs;

public class Lab139_Constructor {
    public static void main(String[] args) {

        Student student1 = new Student(); //student1 object of Student Class created , default constructor will be called automatically
        Student student2 = new Student("Pramod"); //student2 object of Student Class created , parametrized constructor will be called this time
    }
}

class Student {

        String name;

        Student()           // Default Constructor
        {

            System.out.println("Default Constructor called");
        }
        Student(String name)       // Parameterized Constructor
        {
            System.out.println("Hi, " +name);
        }
        void sleep(){};
        void study(){};
        void eat (){};

}

