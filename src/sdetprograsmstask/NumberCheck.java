package sdetprograsmstask;

import java.util.Scanner;

public class NumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter a number: ");
        double number = scanner.nextDouble();

        // Check if number is positive, negative or zero
        if (number > 0) {
            System.out.println("The number is Positive.");
        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

        scanner.close();
    }
}
