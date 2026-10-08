public class Employeelab 1 {
    public static void main(String[] args) {
        FullTimeEmployee ft1 = new FullTimeEmployee("EMP101", "Priya Sharma", "Software Development", 85000, 12000);
        FullTimeEmployee ft2 = new FullTimeEmployee("EMP102", "Rahul Verma", "Finance", 75000, 10000);
        PartTimeEmployee pt1 = new PartTimeEmployee("EMP103", "Ananya Gupta", "HR", 85, 450);

        System.out.println("--- Full Time Employee 1 ---");
        ft1.displayDetails();

        System.out.println("\n--- Full Time Employee 2 ---");
        ft2.displayDetails();

        System.out.println("\n--- Part Time Employee ---");
        pt1.displayDetails();
    }
}

class Employee {
    // Encapsulation: Private fields
    private String employeeId;
    private String name;
    private String department;
    private double salary;

    // Constructor
    public Employee(String employeeId, String name, String department, double salary) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    // Getters
    public String getEmployeeId() {
        return employeeId;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    // Setter
    public void setDepartment(String department) {
        this.department = department;
    }

    // Display method
    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }
}

// FullTimeEmployee inherits from Employee
class FullTimeEmployee extends Employee {
    private double bonus;

    public FullTimeEmployee(String id, String name, String dept, double salary, double bonus) {
        super(id, name, dept, salary);
        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return getSalary() + bonus;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total Salary: ₹" + getTotalSalary());
    }
}

// PartTimeEmployee inherits from Employee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, String dept, int hours, double rate) {
        super(id, name, dept, 0);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Hours Worked: " + hoursWorked);
        System.out.println("Hourly Rate: ₹" + hourlyRate);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }
}

