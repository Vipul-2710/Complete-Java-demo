import java.util.Scanner;

public class Employee {

    // Method to calculate gross salary
    static double calculateSalary(double basic) {

        return basic + (basic * 0.20);

    }

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Basic Salary: ");

        double basicSalary = sc.nextDouble();

        double salary = calculateSalary(basicSalary);

        System.out.println("Gross Salary = " + salary);

        sc.close();
    }
}