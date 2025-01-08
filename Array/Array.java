public class Array {

    public static void main(String[] args) {
        // 1. Declaration and Initialization of Arrays
        int[] numbers = {10, 20, 30, 40, 50};
        String[] names = {"Alice", "Bob", "Charlie"};
        
        System.out.println("Array elements (int):");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        System.out.println("Array elements (String):");
        for (String name : names) {
            System.out.print(name + " ");
        }
        System.out.println("\n");

        // 2. Dynamic Initialization
        int[] dynamicArray = new int[5];
        for (int i = 0; i < dynamicArray.length; i++) {
            dynamicArray[i] = i * 10; // Assigning values dynamically
        }
        System.out.println("Dynamically initialized array:");
        for (int value : dynamicArray) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        // 3. Multidimensional Array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };
        System.out.println("2D Array (Matrix):");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        // 4. Common Operations
        // Find maximum element in an array
        int max = numbers[0];
        for (int number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Maximum element in numbers array: " + max);

        // Find sum and average of array elements
        int sum = 0;
        for (int number : numbers) {
            sum += number;
        }
        double average = (double) sum / numbers.length;
        System.out.println("Sum of numbers array: " + sum);
        System.out.println("Average of numbers array: " + average);

        // Reverse an array
        System.out.println("Reversed numbers array:");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\n");

        // 5. Jagged Array
        int[][] jaggedArray = {
            {1, 2, 3},
            {4, 5},
            {6, 7, 8, 9}
        };
        System.out.println("Jagged Array:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }

        // 6. Copying Arrays
        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
        System.out.println("\nCopied Array:");
        for (int value : copiedArray) {
            System.out.print(value + " ");
        }
        System.out.println("\n");

        // 7. Searching in an Array
        int searchElement = 30;
        boolean found = false;
        for (int number : numbers) {
            if (number == searchElement) {
                found = true;
                break;
            }
        }
        System.out.println("Element " + searchElement + (found ? " found" : " not found") + " in numbers array.");
    }
}
