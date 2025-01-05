import java.util.Scanner;  // Import the Scanner class

public class assignment {
    public static void main(String[] args) {
        double bill_amount;
        bill_amount = 0;
        Scanner sc = new Scanner(System.in);  // Now Scanner is recognized
        System.out.println("Enter the name: ");
        String name = sc.nextLine();
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        System.out.println("Enter the bill amount: ");
        int amount = sc.nextInt();
        if (age < 22 && amount > 10000) {
            bill_amount = amount - (amount * 0.15);
        } else if (amount > 10000) {
            bill_amount = amount - (amount * 0.10);
        } else if (age < 22) {
            bill_amount = amount - (amount * 0.05);
        } else {
            bill_amount = amount;
        }
        System.out.println("Final bill amount for " + name + ": " + bill_amount);
    }
}
