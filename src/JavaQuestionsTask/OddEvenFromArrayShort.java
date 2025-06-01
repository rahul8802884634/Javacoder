package JavaQuestionsTask;

public class OddEvenFromArrayShort {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Even numbers: ");
        for (int number : numbers) {
            if (number % 2 == 0) System.out.print(number + " ");
        }
        System.out.println(); // New line

        System.out.print("Odd numbers:  ");
        for (int number : numbers) {
            if (number % 2 != 0) System.out.print(number + " ");
        }
        System.out.println(); // New line
    }
}
