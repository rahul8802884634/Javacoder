package Tasks;

import java.util.Scanner;

public class Task5_Triangle_Classification {
    public static void main(String[] args) {

        System.out.println("Enter length of three sides of triangle ");
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length of side 1");
        int side1 = scanner.nextInt();

        System.out.println("Enter length of side 2");
        int side2 = scanner.nextInt();

        System.out.println("Enter length of side 3");
        int side3 = scanner.nextInt();

        // Triangle validity check
        if ((side1 + side2 > side3) &&
                (side2 + side3 > side1) &&
                (side1 + side3 > side2)) {

            // Classification
            if (side1 == side2 && side2 == side3) {
                System.out.println("This is an equilateral triangle");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("This is an isosceles triangle");
            } else {
                System.out.println("This is a scalene triangle");
            }

        } else {
            System.out.println("The given sides do not form a valid triangle");
        }
    }
}