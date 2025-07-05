package sdetprograsmstask;

public class PrintJavaFiveTimes {
    public static void main(String[] args) {

        System.out.println("Printing 'Java' 5 times using a while loop:");

        int count = 0; // Initialize a counter. We'll start from 0 for 5 iterations.

        // Loop as long as count is less than 5
        while (count < 5) {
            System.out.println("Java"); // Print the string "Java"
            count++; // Increment the counter to move towards the loop's termination
        }
    }
}