import java.util.Scanner;
import java.util.regex.Pattern;


public class Practice {
    public void checkRegex(String regex, String str) {
        System.out.println(Pattern.matches(regex, str));
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Practice p = new Practice();


        while (true) {
            System.out.println("Enter the regex: ");
            String regex = sc.nextLine();
            System.out.println("Enter the string to check against the regex: ");
            String str = sc.nextLine();
            p.checkRegex(regex, str);


            System.out.println("Do you want to continue? (yes/no): ");
            String choice = sc.nextLine().toLowerCase();


            if (choice.equals("no")) {
                System.out.println("Exiting the program.");
                break;
            } else if (!choice.equals("yes")) {
                System.out.println("Invalid input. Exiting the program.");
                break;
            }
        }


     
    }
}
