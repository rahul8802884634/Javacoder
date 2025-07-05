package sdetprograsmstask;

public class SumOfNaturalNumbersWhileLoop {
    public static void main(String[] args) {

        int sum = 0; // Initialize a variable to store the sum
        int i = 1;   // Initialize our counter, starting from the first natural number

        System.out.println("Calculating the sum of the first 10 natural numbers using a while loop:");

        // Loop as long as 'i' is less than or equal to 10
        while (i <= 10) {
            sum = sum + i; // Add the current number (i) to the sum
            // This can also be written as: sum += i;

            i++; // Increment i to move to the next natural number
        }

        // Print the final sum after the loop has finished
        System.out.println("The sum of the first 10 natural numbers is: " + sum);
    }
}