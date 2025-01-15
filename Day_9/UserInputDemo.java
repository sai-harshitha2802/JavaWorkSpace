
import java.util.InputMismatchException;
import java.util.Scanner;

public class UserInputDemo {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int result = 0;
        try {
            System.out.println("enter the a value");
            int a = sc.nextInt();

            System.out.println("enter the b value");
            int b = sc.nextInt();
            result = a / b;
            System.out.println("result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("do no divivde with zero");

        } catch (InputMismatchException e) {
            System.out.println("enter only number");

        }
    }

}
