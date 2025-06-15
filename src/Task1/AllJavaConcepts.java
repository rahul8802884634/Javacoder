package Task1;

import java.util.ArrayList;

public class AllJavaConcepts {

    public static void main(String[] args) {

        // -----------------------------
        // 1. Autoboxing and Unboxing
        // -----------------------------
        System.out.println("1. Autoboxing and Unboxing:");

        int primitiveInt = 10;                 // Primitive int
        Integer wrappedInt = primitiveInt;     // Autoboxing: int to Integer
        Integer anotherWrappedInt = 20;
        int unboxedInt = anotherWrappedInt;    // Unboxing: Integer to int

        System.out.println("Autoboxed Integer: " + wrappedInt);
        System.out.println("Unboxed int: " + unboxedInt);
        System.out.println();

        // -----------------------------
        // 2. Using Wrapper in Collections
        // -----------------------------
        System.out.println("2. Using Wrapper in Collections:");

        ArrayList<Integer> intList = new ArrayList<>(); // ArrayList can't store primitives directly
        intList.add(100);  // Autoboxing: int to Integer
        intList.add(200);
        intList.add(300);

        for (Integer number : intList) {
            System.out.println("Element: " + number); // Unboxing happens automatically while printing
        }
        System.out.println();

        // -----------------------------
        // 3. Converting String to Primitive Using Wrapper
        // -----------------------------
        System.out.println("3. Converting String to Primitive:");

        String numberStr = "123";               // String that looks like a number
        int parsedInt = Integer.parseInt(numberStr); // Convert String to int using parseInt
        System.out.println("Parsed int value: " + parsedInt);
        System.out.println();

        // -----------------------------
        // 4. Arithmetic Exception Example
        // -----------------------------
        System.out.println("4. Arithmetic Exception Example:");

        try {
            int x = 10;
            int y = 0;
            int result = x / y; // This line will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }
        System.out.println();

        // -----------------------------
        // 5. Multiple Catch Blocks Example
        // -----------------------------
        System.out.println("5. Multiple Catch Blocks Example:");

        try {
            int[] arr = new int[3];
            arr[5] = 50;  // This line throws ArrayIndexOutOfBoundsException
            int result = 10 / 0;  // This will not execute due to exception above
            System.out.println("Result: " + result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Caught ArrayIndexOutOfBoundsException: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Caught ArithmeticException: " + e.getMessage());
        }

    }
}