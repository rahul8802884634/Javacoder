package Tasks;

import java.util.Scanner;

public class Task3_Max_in_3_Numbers {
    public static void main(String[] args) {
        int a, b, c, max;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        a = scanner.nextInt();

        System.out.println("Enter second number:");
        b = scanner.nextInt();

        System.out.println("Enter third number:");
        c = scanner.nextInt();

        if (a > b) {
            if (a > c)
                max = a;
            else
                max = c;
        } else {
            if (b > c)
                max = b;
            else
                max = c;
        }

        System.out.println("Maximum number is: " + max);
    }
}