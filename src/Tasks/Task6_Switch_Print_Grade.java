package Tasks;

import java.util.Scanner;

public class Task6_Switch_Print_Grade {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the Grade A,B,C,D,F");
        String grade= scanner.next().toUpperCase();

        switch(grade) {
            case "A" -> System.out.println("Excellent");
            case "B" -> System.out.println("Very Good");
            case "C" -> System.out.println("Good");
            case "D" -> System.out.println("Needs Improvement");
            case "F" -> System.out.println("Fail");
            default -> System.out.println("Invalid grade");
        }
    }
}