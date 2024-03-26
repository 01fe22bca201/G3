package G3;

public class Employee {
    private String name;
    private int empId;
    private double salary;

    public Employee(String name, int empId, double salary) {
        this.name = name;
        this.empId = empId;
        this.salary = salary;
    }

    public void displayEmployeeDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: $" + salary);
    }

    public double getSalary() {
        return salary;
    }
}
 
