
public class Pattern {

    public static void main(String args[]) {

        // Star Pattern using Nested For Loop

        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= i; j++) {

                System.out.print("* ");

            }

            System.out.println();

        }

        System.out.println();

        // Demonstration of Continue and Break

        for (int i = 1; i <= 10; i++) {

            if (i == 5)
                continue;

            if (i == 9)
                break;

            System.out.print(i + " ");

        }

    }

}