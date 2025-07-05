package sdetprograsmstask;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Define the minimum voting age
        final int MIN_VOTING_AGE = 18; // In India, the minimum voting age is 18

        // Take user input for age
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Check eligibility based on age
        if (age >= MIN_VOTING_AGE) {
            System.out.println("You are " + age + " years old. You are eligible to vote!");
        } else if (age > 0) { // Ensure age is a positive number
            System.out.println("You are " + age + " years old. You are not yet eligible to vote. You need to be " + MIN_VOTING_AGE + " years old.");
        } else {
            System.out.println("Invalid age entered. Age cannot be zero or negative.");
        }

        scanner.close();
    }
}