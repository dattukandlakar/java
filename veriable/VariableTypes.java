public class VariableTypes {

    // Instance variable
    String instanceVariable = "Instance Variable";

    // Static variable
    static String staticVariable = "Static Variable";

    public static void main(String[] args) {
        // Local variable
        String localVariable = "Local Variable";

        // Primitive types
        byte byteValue = 100;
        short shortValue = 32000;
        int intValue = 100000;
        long longValue = 100000000L;

        float floatValue = 10.5f;
        double doubleValue = 123.456;

        char charValue = 'A';
        boolean booleanValue = true;

        // Reference types
        String stringValue = "I am a String";
        int[] arrayValue = {1, 2, 3, 4, 5};

        // Printing all variables
        System.out.println("Instance Variable: " + new VariableTypes().instanceVariable);
        System.out.println("Static Variable: " + staticVariable);
        System.out.println("Local Variable: " + localVariable);

        System.out.println("byte: " + byteValue);
        System.out.println("short: " + shortValue);
        System.out.println("int: " + intValue);
        System.out.println("long: " + longValue);

        System.out.println("float: " + floatValue);
        System.out.println("double: " + doubleValue);

        System.out.println("char: " + charValue);
        System.out.println("boolean: " + booleanValue);

        System.out.println("String: " + stringValue);
        System.out.print("Array: ");
        for (int i : arrayValue) {
            System.out.print(i + " ");
        }
    }
}
