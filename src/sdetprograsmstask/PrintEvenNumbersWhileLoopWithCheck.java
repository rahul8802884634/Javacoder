package sdetprograsmstask;

public class PrintEvenNumbersWhileLoopWithCheck {
    public static void main(String[] args) {

        System.out.println("Even numbers from 1 to 20 (checking each number with while loop):");

        int i = 1; // 1. Initialization: Start our counter at 1 (to check all numbers)

        // 2. Condition: Continue as long as i is less than or equal to 20
        while (i <= 20) {
            // Check if the current number is even using the modulo operator
            if (i % 2 == 0) { // If the remainder when divided by 2 is 0, it's even
                System.out.println(i);
            }
            i++; // 3. Update: Increment i by 1 to move to the next number
        }
    }
}