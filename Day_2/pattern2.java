import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner sc =new Scanner (System.in);
        System.out.println(" Enter the n");
        int n= sc.nextInt();
        for (int i = 1; i <= n; i++) {
            // Loop for printing stars in each row
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
    
}
