import java.util.Scanner;
import java.util.Arrays; // Required to use Arrays.toString()

class Hello {
    private int value;
    private int[] numbers = new int[5];
    private int addition = 0; // Corrected spelling from "addtion" to "addition"

    // Constructor to initialize the value
    Hello(int value) {
        this.value = value;
    }

    // Method to take input and calculate the sum
    void loop(Scanner scanner) {
        System.out.println("Enter " + numbers.length + " numbers:");
        for (int i = 0; i < numbers.length; i++) {
            // Store integers in the array
            numbers[i] = scanner.nextInt();
            // Add to the total
            addition += numbers[i];
        }
        // Print array contents and their sum
        System.out.println("Numbers are: " + Arrays.toString(numbers) + 
                           ", Addition of numbers: " + addition);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello world");

        // Create an instance of Hello and initialize the value
        Hello hello = new Hello(4);
        System.out.println("Hello World, the value is: " + hello.value);

        // Call the loop method to handle input and output
        hello.loop(scanner);

        // Close the scanner to release resources
        scanner.close();
    }
}
