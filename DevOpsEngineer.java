package G3;

public class DevOpsEngineer extends Employee {
    private double bonus;

    public DevOpsEngineer(String name, int empId, double salary, double bonus) {
        super(name, empId, salary);
        this.bonus = bonus;
    }

    @Override
    public void displayEmployeeDetails() {
        super.displayEmployeeDetails();
        System.out.println("Bonus: $" + bonus);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    private double calculateTotalSalary() {
        return getSalary() + bonus;
    }


    public static void main(String[] args) {
        // Create an Employee object
        Employee employee = new Employee("John Doe", 1001, 60000);
        // Display employee details
        employee.displayEmployeeDetails();

        // Create a DevOpsEngineer object
        DevOpsEngineer devOpsEngineer = new DevOpsEngineer("Jane Smith", 1002, 70000, 5000);
        // Display DevOps engineer details
        devOpsEngineer.displayEmployeeDetails();
    }
} 