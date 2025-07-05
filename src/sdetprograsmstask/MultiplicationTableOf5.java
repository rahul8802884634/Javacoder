package sdetprograsmstask;

public class MultiplicationTableOf5 {
    public static void main(String[] args) {

        int number = 5; // The number for which we want the multiplication table

        System.out.println("Multiplication Table of " + number + ":");

        // Loop from 1 to 10 (standard range for a multiplication table)
        for (int i = 1; i <= 10; i++) {
            int product = number * i; // Calculate the product

            // Print the multiplication expression and its result
            System.out.println(number + " x " + i + " = " + product);
        }
    }
}