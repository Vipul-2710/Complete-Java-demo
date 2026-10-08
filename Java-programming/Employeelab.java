
/**
 * LAB : Polymorphism and Abstraction
 * Employee Management System
 */

// Main System
public class Employeelab {
    public static void main(String[] args) {
        Employee e1 = new FullTimeEmployee("EMP201", "Aarav Patel", "Software Development", 95000, 15000);
        Employee e2 = new PartTimeEmployee("EMP202", "Sneha Reddy", "Marketing", 120, 350);
        Employee e3 = new Manager("EMP203", "Vikram Singh", "Software Development", 120000, 20000, 25000);

        Employee[] employees = {e1, e2, e3};

        for (Employee emp : employees) {
            emp.displayBasicInfo();
            System.out.println("Type: " + emp.getEmployeeType());
            System.out.println("Salary Details:");
            emp.showPaymentDetails();
            System.out.println("-----------------------------------");
        }
    }
}


// Interface - Abstraction
interface Payable {
    double calculateSalary();
    void showPaymentDetails();
}

// Abstract class
abstract class Employee implements Payable {
    private String employeeId;
    private String name;
    private String department;

    public Employee(String employeeId, String name, String department) {
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public void displayBasicInfo() {
        System.out.println("Employee: " + name + " | Department: " + department);
    }

    // Abstract method
    public abstract String getEmployeeType();
}

// FullTimeEmployee
class FullTimeEmployee extends Employee {
    private double baseSalary;
    private double bonus;

    public FullTimeEmployee(String id, String name, String dept, double baseSalary, double bonus) {
        super(id, name, dept);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    @Override
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Base Salary: ₹" + baseSalary);
        System.out.println("Bonus: ₹" + bonus);
        System.out.println("Total: ₹" + calculateSalary());
    }

    @Override
    public String getEmployeeType() {
        return "Full-Time";
    }
}

// PartTimeEmployee
class PartTimeEmployee extends Employee {
    private int hoursWorked;
    private double hourlyRate;

    public PartTimeEmployee(String id, String name, String dept, int hours, double rate) {
        super(id, name, dept);
        this.hoursWorked = hours;
        this.hourlyRate = rate;
    }

    @Override
    public double calculateSalary() {
        return hoursWorked * hourlyRate;
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Hours Worked: " + hoursWorked + " | Rate: ₹" + hourlyRate);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }

    @Override
    public String getEmployeeType() {
        return "Part-Time";
    }
}

// Manager
class Manager extends FullTimeEmployee {
    private double performanceBonus;

    public Manager(String id, String name, String dept, double baseSalary, double bonus, double perfBonus) {
        super(id, name, dept, baseSalary, bonus);
        this.performanceBonus = perfBonus;
    }

    @Override
    public double calculateSalary() {
        return super.calculateSalary() + performanceBonus;
    }

    @Override
    public void showPaymentDetails() {
        System.out.println("Performance Bonus: ₹" + performanceBonus);
        System.out.println("Total Salary: ₹" + calculateSalary());
    }

    @Override
    public String getEmployeeType() {
        return "Manager";
    }
}


