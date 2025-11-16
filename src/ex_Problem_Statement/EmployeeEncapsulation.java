package ex_Problem_Statement;

public class EmployeeEncapsulation {

    private int id;
    private String name;
    private double salary;

    // Constructor
    public EmployeeEncapsulation(int id,String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    // Getter and Setter for name
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}

class MainEmployee {
    public static void main(String[] args) {
        EmployeeEncapsulation emp = new EmployeeEncapsulation( 1,"John Doe", 50000.00);

        // Accessing employee details using getters

        System.out.println("Employee ID: " + emp.getId());
        System.out.println("Employee Name: " + emp.getName());
        System.out.println("Employee Salary: " + emp.getSalary());

        // Modifying employee details using setters
        emp.setName("Jane Smith");
        emp.setSalary(80000.00);

        System.out.println("Updated Employee Name: " + emp.getName());
        System.out.println("Updated Employee Salary: " + emp.getSalary());
    }
}