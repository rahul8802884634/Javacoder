package sdetprograsmstask;

public class MultiplicationTableOf7WhileLoop {
    public static void main(String[] args) {

        int number = 7; // The number for which we want the multiplication table
        int i = 1;      // Initialize our multiplier, starting from 1

        System.out.println("Multiplication Table of " + number + " (using a while loop):");

        // Loop as long as 'i' (the multiplier) is less than or equal to 10
        while (i <= 10) {
            int product = number * i; // Calculate the product of 7 and the current multiplier

            // Print the multiplication expression and its result
            System.out.println(number + " x " + i + " = " + product);

            i++; // Increment the multiplier for the next iteration
        }
    }
}