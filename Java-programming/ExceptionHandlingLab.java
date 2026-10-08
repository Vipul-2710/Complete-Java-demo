package com.codewithbhabs;

/**
 * Exception Handling in Java
 * Robust Employee Management System
 */
public class ExceptionHandlingLab {
    public static void main(String[] args) {

        // 1. try-catch with Multiple Catch Blocks
        try {
            // This will throw ArithmeticException
            int result = 10 / 0;
        }
        catch (ArithmeticException e) {
            System.out.println("Arithmetic Error: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }

        System.out.println("\n--- Creating Employees ---");

        // 2. Handling Custom Exception
        try {
            Employee emp1 = new Employee("EMP101", "Priya Sharma", "Software Development", 85000);
            emp1.displayDetails();

            Employee emp2 = new Employee("EMP102", "Rahul Verma", "Finance", -5000); // Invalid salary
        }
        catch (InvalidSalaryException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        }

        // 3. Using throw and throws
        try {
            Employee emp3 = new Employee("EMP103", "Aarav Patel", "HR", 65000);
            emp3.updateSalary(25000);     // Valid
            emp3.updateSalary(5000);      // Will throw custom exception
        }
        catch (InvalidSalaryException e) {
            System.out.println("Salary Update Error: " + e.getMessage());
        }

        // 4. Finally Block Demonstration
        System.out.println("\n--- Finally Block Demo ---");
        try {
            Employee emp4 = new Employee("EMP104", "Sneha Reddy", "Marketing", 45000);
            System.out.println("Employee created successfully.");
        }
        catch (InvalidSalaryException e) {
            System.out.println("Error: " + e.getMessage());
        }
        finally {
            System.out.println("Finally block: Employee record processing completed.");
        }

        // 5. Null Pointer Exception Handling
        System.out.println("\n--- Null Pointer Exception Demo ---");
        try {
            String name = null;
            System.out.println("Name length: " + name.length()); // This will throw NullPointerException
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Error: Trying to access method on null object");
        }
        finally {
            System.out.println("Finally: Null check completed.");
        }
    }
}



// Custom Exception Class
class InvalidSalaryException extends Exception {
    public InvalidSalaryException(String message) {
        super(message);
    }
}

class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double salary;

    public Employee(String employeeId, String name, String department, double salary)
            throws InvalidSalaryException {
        if (salary < 0) {
            throw new InvalidSalaryException("Salary cannot be negative!");
        }
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public void displayDetails() {
        System.out.println("ID: " + employeeId);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Salary: ₹" + salary);
    }

    // Method demonstrating throws
    public void updateSalary(double newSalary) throws InvalidSalaryException {
        if (newSalary < 10000) {
            throw new InvalidSalaryException("Salary cannot be less than ₹10,000!");
        }
        this.salary = newSalary;
        System.out.println("Salary updated successfully to ₹" + newSalary);
    }
}

