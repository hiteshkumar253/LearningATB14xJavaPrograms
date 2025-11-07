//Static Keyword in Java
//1. Static Variable
//2. Static Method
//3. Static Block
//4. Static Nested Class

package ex_24_Static;

public class Lab166_Static {

    public static void main(String[] args) {
        Student s1 = new Student(23);  // Object Creation
        Student s2 = new Student(33);  // Object Creation

        System.out.println(s1.age);   // Accessing Instance Variable,23
        System.out.println(s2.age);   // Accessing Instance Variable,33

        System.out.println(Student.course_name);  // Accessing Static Variable using Class Name

        System.out.println(s1.course_name);  // Accessing Static Variable using Object Reference
        System.out.println(s2.course_name);  // Accessing Static Variable using Object Reference

        Student.m1();  // Accessing Static Method using Class Name
        s1.m1();       // Accessing Static Method using Object Reference
        s2.m1();       // Accessing Static Method using Object Reference
    }
}

    class Student {
        int age;          // Non Static or Instance Variable , Attribute,
        static String course_name = "ATB";


        public Student(int age_c) {
            this.age = age_c;
        }

        static void m1() {
            System.out.println("I am static Method");
        }
    }