package sdetprograsmstask;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input
        System.out.print("Enter an integer: ");
        int number = scanner.nextInt(); // Using nextInt() for integers

        // Check if the number is even or odd
        if (number % 2 == 0) {
            System.out.println("The number " + number + " is Even.");
        } else {
            System.out.println("The number " + number + " is Odd.");
        }

        scanner.close();
    }
}