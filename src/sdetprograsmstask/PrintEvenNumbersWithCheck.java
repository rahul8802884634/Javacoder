package sdetprograsmstask;

public class PrintEvenNumbersWithCheck {
    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 20 (checking each number):");

        // Loop through all numbers from 1 to 20
        for (int i = 1; i <= 20; i++) {
            // Check if the current number is even using the modulo operator
            if (i % 2 == 0) { // If the remainder when divided by 2 is 0, it's even
                System.out.println(i);
            }
        }
    }
}