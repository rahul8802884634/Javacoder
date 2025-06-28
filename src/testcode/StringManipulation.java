package testcode;

public class StringManipulation {
    public static void main(String[] args) {
        // Input string
        String input = "Hello World";

        // 1. Length of the string
        int length = input.length();

        // 2. First character
        char firstChar = input.charAt(0);

        // 3. Substring "World"
        String substring = input.substring(6); // from index 6 to end

        // Display the results
        System.out.println("Length: " + length);
        System.out.println("First char: " + firstChar);
        System.out.println("Substring: " + substring);
    }
}
