package sdetprograsmstask;

import java.util.Scanner;
import java.lang.Math; // Not strictly necessary as Math is in java.lang which is auto-imported

public class MaximumOfTwoConcise {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        double maximum = Math.max(num1, num2); // Finds the maximum directly

        // You can also add a check for equality if desired, but Math.max will return one of the numbers
        if (num1 == num2) {
            System.out.println("Both numbers are equal: " + num1);
        } else {
            System.out.println("The maximum number is: " + maximum);
        }

        scanner.close();
    }
}