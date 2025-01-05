import java.util.Scanner;

public class assignment1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total_balance = 5000;
        int n;

        while (true) {
            System.out.println("Please enter the operation:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    System.out.println("Enter the deposit amount:");
                    int depositAmount = sc.nextInt();
                    total_balance += depositAmount;
                    System.out.println("The total balance after deposit is: " + total_balance);
                    break;

                case 2:
                    System.out.println("Enter the withdraw amount:");
                    int withdrawAmount = sc.nextInt();
                    if (withdrawAmount <= total_balance) {
                        total_balance -= withdrawAmount;
                        System.out.println("The total balance after withdrawal is: " + total_balance);
                    } else {
                        System.out.println("Insufficient balance. Current balance is: " + total_balance);
                    }
                    break;

                case 3:
                    System.out.println("The current balance is: " + total_balance);
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String continue_option = sc.next();
            if (continue_option.equals("no")) {
                System.out.println("Exiting the program.");
                break;
            }
        }
    }
}
