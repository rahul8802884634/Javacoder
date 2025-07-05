package sdetprograsmstask;

import java.util.Scanner;

public class VowelConsonantCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for a character
        System.out.print("Enter a single character: ");
        // Read the first character of the input line
        char ch = scanner.next().charAt(0);

        // Convert the character to lowercase to handle both cases (A/a, E/e, etc.)
        ch = Character.toLowerCase(ch);

        // Check if the character is a vowel or consonant
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println(ch + " is a Vowel.");
        } else if ((ch >= 'a' && ch <= 'z')) { // Check if it's an alphabet
            System.out.println(ch + " is a Consonant.");
        } else {
            System.out.println(ch + " is not an alphabet character.");
        }

        scanner.close();
    }
}