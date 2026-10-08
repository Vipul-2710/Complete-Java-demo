class Account {

    // Private data members (Encapsulation)
    private String name;
    private double balance;

    // Parameterized Constructor
    Account(String name, double balance) {

        this.name = name;
        this.balance = balance;

    }

    // Method to display account details
    public void display() {

        System.out.println("Account Holder : " + name);
        System.out.println("Balance        : " + balance);

    }

}

public class Main {

    public static void main(String args[]) {

        // Creating an object
        Account account = new Account("Rahul", 50000);

        // Calling member method
        account.display();

    }

}