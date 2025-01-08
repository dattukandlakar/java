public class ConditionalStatements {

    public static void main(String[] args) {
        int number = 10;

        // If-else statement
        if (number > 0) {
            System.out.println("The number is positive.");
        } else if (number < 0) {
            System.out.println("The number is negative.");
        } else {
            System.out.println("The number is zero.");
        }

        // Switch-case statement
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'B':
                System.out.println("Good!");
                break;
            case 'C':
                System.out.println("Average!");
                break;
            default:
                System.out.println("Invalid grade.");
        }

        // Ternary operator
        int age = 18;
        String result = (age >= 18) ? "You are an adult." : "You are a minor.";
        System.out.println(result);

        // Nested if
        int marks = 85;
        if (marks > 50) {
            if (marks >= 85) {
                System.out.println("You passed with distinction.");
            } else {
                System.out.println("You passed.");
            }
        } else {
            System.out.println("You failed.");
        }

        // Loops combined with conditionals (Example: Checking even/odd numbers)
        System.out.println("Checking numbers from 1 to 5:");
        for (int i = 1; i <= 5; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even.");
            } else {
                System.out.println(i + " is odd.");
            }
        }
    }
}
