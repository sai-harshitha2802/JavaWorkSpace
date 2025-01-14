
import java.util.*;

public class StudentMarks {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of students
        System.out.print("Enter number of Students: ");

        int numStudents = scanner.nextInt();

        if (numStudents <= 0) {

            System.out.println("Number of students must be greater than 0.");

            return; // Exit if no students are entered

        }

        // Step 2: Input the marks
        System.out.println("Enter Marks:");

        int[] marks = new int[numStudents];

        // Handling invalid marks input
        for (int i = 0; i < numStudents; i++) {

            while (!scanner.hasNextInt()) {

                System.out.print("Please enter a valid integer for marks: ");

                scanner.next(); // Consume the invalid input

            }

            marks[i] = scanner.nextInt();

        }

        // Step 3: Find the highest mark
        int highestMark = marks[0];

        for (int mark : marks) {

            if (mark > highestMark) {

                highestMark = mark;

            }

        }

        System.out.println("Highest Marks: " + highestMark);

        // Step 4: Calculate the average marks
        int total = 0;

        for (int mark : marks) {

            total += mark;

        }

        double averageMarks = (double) total / numStudents;

        System.out.println("Average Marks: " + averageMarks);

        // Step 5: Display the 3rd student's marks (if available)
        if (numStudents >= 3) {

            System.out.println("3rd Student marks: " + marks[2]);

        } else {

            System.out.println("3rd Student marks: Not Available");

        }

        // Step 6: Display all marks with their indices
        System.out.print("Marks: ");

        for (int i = 0; i < numStudents; i++) {

            System.out.print((i + 1) + "-" + marks[i] + " ");

        }

        System.out.println();

        // Step 7: Sort and display the marks
        Arrays.sort(marks);

        System.out.print("Sorted: ");

        for (int i = 0; i < numStudents; i++) {

            System.out.print((i + 1) + "-" + marks[i] + " ");

        }

        System.out.println();

        scanner.close();

    }

}
