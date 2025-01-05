import java.util.Scanner;

class Account {
    private int id;
    private String name;
    private int balance;

    // Constructor to initialize values
    public Account(int id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Method to withdraw money
    public void withdraw(int amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawal successful. New balance: " + balance);
        } else {
            System.out.println("Insufficient balance or invalid amount.");
        }
    }

    // Method to deposit money
    public void deposit(int amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposit successful. New balance: " + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

    // Method to display the current balance
    public void displayBalance() {
        System.out.println("Current balance: " + balance);
    }

    // Method to display account details
    public void displayAccountDetails() {
        System.out.println("Account Details:");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Balance: " + balance);
    }
}

public class AccountApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create an account object with initial details
        System.out.print("Enter account ID: ");
        int id = sc.nextInt();
        sc.nextLine(); // Consume newline
        System.out.print("Enter account holder's name: ");
        String name = sc.nextLine();
        System.out.print("Enter initial balance: ");
        int balance = sc.nextInt();

        Account account = new Account(id, name, balance);

        int choice;

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Withdraw");
            System.out.println("2. Deposit");
            System.out.println("3. Display Balance");
            System.out.println("4. Display Account Details");
            System.out.println("5. Exit");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter amount to withdraw: ");
                    int withdrawAmount = sc.nextInt();
                    account.withdraw(withdrawAmount);
                    break;

                case 2:
                    System.out.print("Enter amount to deposit: ");
                    int depositAmount = sc.nextInt();
                    account.deposit(depositAmount);
                    break;

                case 3:
                    account.displayBalance();
                    break;

                case 4:
                    account.displayAccountDetails();
                    break;

                case 5:
                    System.out.println("Exiting the application.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
