package sdetprograsmstask;

public class PrintNumbersWhileLoop {
    public static void main(String[] args) {

        System.out.println("Numbers from 1 to 10 using a while loop:");

        int i = 1; // 1. Initialization: Start our counter at 1

        // 2. Condition: Continue as long as i is less than or equal to 10
        while (i <= 10) {
            System.out.println(i); // Print the current number
            i++; // 3. Update: Increment i for the next iteration
        }
    }
}