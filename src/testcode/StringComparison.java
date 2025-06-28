package testcode;

public class StringComparison {
    public static void main(String[] args) {
        // Input strings
        String string1 = "Hello";
        String string2 = "hello";
        String string3 = "Hello";

        // Using equals()
        boolean equalsResult = string1.equals(string2);

        // Using equalsIgnoreCase()
        boolean equalsIgnoreCaseResult = string1.equalsIgnoreCase(string2);

        // Using compareTo()
        int compareToResult = string1.compareTo(string2);

        // Output
        System.out.println("equals(): " + equalsResult);                      // false
        System.out.println("equalsIgnoreCase(): " + equalsIgnoreCaseResult); // true
        System.out.println("compareTo(): " + compareToResult);               // -32
    }
}
