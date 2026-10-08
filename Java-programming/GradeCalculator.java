import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Percentage: ");
        double marks = sc.nextDouble();

        if (marks >= 90)
            System.out.println("Grade A");
        else if (marks >= 75)
            System.out.println("Grade B");
        else if (marks >= 60)
            System.out.println("Grade C");
        else
            System.out.println("Fail");

        System.out.print("Enter Department Code (1-CSE, 2-ECE, 3-ME): ");
        int ch = sc.nextInt();

        switch (ch) {

            case 1:
                System.out.println("Computer Science");
                break;

            case 2:
                System.out.println("Electronics");
                break;

            case 3:
                System.out.println("Mechanical");
                break;

            default:
                System.out.println("Invalid Department Code");
        }

        sc.close();
    }
}