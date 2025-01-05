import java.util.Scanner;

class Car {
    private int speed;

    public Car() {
        speed = 0;
    }

    public void accelerate() {
        speed += 5;
    }

    public void brake() {
        if (speed >= 5) {
            speed -= 5;
        } else {
            speed = 0; // Ensures speed doesn't go negative
        }
    }

    public void displaySpeed() {
        System.out.println("Current speed: " + speed + " km/h");
    }
}

public class CarApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar = new Car(); // Create an object of the Car class
        int n;

        while (true) {
            System.out.println("Enter the operation number you want to perform:");
            System.out.println("1. Accelerate");
            System.out.println("2. Brake");
            System.out.println("3. Display Speed");
            System.out.println("4. Exit");
            n = sc.nextInt();

            switch (n) {
                case 1:
                    myCar.accelerate();
                    myCar.displaySpeed();
                    break;

                case 2:
                    myCar.brake();
                    myCar.displaySpeed();
                    break;

                case 3:
                    myCar.displaySpeed();
                    break;

                case 4:
                    System.out.println("Exiting the program.");
                    sc.close();
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
            }

            System.out.println("Do you want to continue? (yes/no)");
            String continueOption = sc.next();
            if (continueOption.equalsIgnoreCase("no")) {
                System.out.println("Exiting the program.");
                break;
            }
        }
    }
}
