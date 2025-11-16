package ex_Problem_Statement;

public class PersonClassImplementation
{
    String name;
    int age;

    PersonClassImplementation(String name, int age)
    {
        this.name = name;
        this.age = age;
    }
    void displayInfo()
    {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

class Main {
    public static void main(String[] args) {
        PersonClassImplementation pc1 = new PersonClassImplementation("Alice", 30);
        PersonClassImplementation pc2 = new PersonClassImplementation("Bob", 25);
        pc1.displayInfo();
        pc2.displayInfo();
    }
}
