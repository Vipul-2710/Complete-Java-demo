//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;

public class StudentInfo {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Roll Number: ");
        int roll = sc.nextInt();

        System.out.print("Enter Marks in Java: ");
        int java = sc.nextInt();

        System.out.print("Enter Marks in Python: ");
        int python = sc.nextInt();

        System.out.print("Enter Marks in DBMS: ");
        int dbms = sc.nextInt();

        int total = java + python + dbms;
        double average = total / 3.0;

        System.out.println("\nStudent Report");
        System.out.println("Name : " + name);
        System.out.println("Roll : " + roll);
        System.out.println("Total : " + total);
        System.out.println("Average : " + average);
    }
}