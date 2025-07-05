package sdetprograsmstask;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {

        int sum = 0; // Initialize a variable to store the sum

        System.out.println("Calculating the sum of the first 10 natural numbers:");

        // Loop from 1 to 10
        for (int i = 1; i <= 10; i++) {
            sum = sum + i; // Add the current number (i) to the sum
            // This can also be written as: sum += i;
        }

        // Print the final sum after the loop has finished
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}