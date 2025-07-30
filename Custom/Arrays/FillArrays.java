package Arrays;
import java.util.Scanner;
import java.util.Arrays; // Import the Arrays class to easily print the array contents

public class FillArrays {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Declare an integer array.
        int[] numbers = new int[3];
        System.out.println("--- Enter 3 Integer Values ---");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            
            // Read the integer from the user and store it in the current array element
            numbers[i] = scanner.nextInt();
        }


        // --- Part 2: Filling a String Array ---

        // Declare a String array. Let's also make it size 3.
        String[] students = new String[3];
        System.out.println("\n--- Enter 3 Student Names ---");
        scanner.nextLine(); 

        // Loop through the array to fill it
        for (int i = 0; i < students.length; i++) {
            // Prompt the user for each name
            System.out.print("Enter name for student " + (i + 1) + ": ");

            // Read the full line of text from the user
            students[i] = scanner.nextLine();
        }


        // --- Part 3: Display the Results ---

        System.out.println("\n--- Arrays Filled Successfully! ---");
        
        // Use Arrays.toString() for a clean way to print the array contents
        System.out.println("The numbers array contains: " + Arrays.toString(numbers));
        System.out.println("The students array contains: " + Arrays.toString(students));

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
