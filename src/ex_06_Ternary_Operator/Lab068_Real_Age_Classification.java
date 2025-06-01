package ex_06_Ternary_Operator;

public class Lab068_Real_Age_Classification {
    public static void main(String[] args) {
        // Check if an argument is provided
        if (args.length == 0) {
            System.out.println("Please provide an age as a command line argument.");
            return; // Exit the program if no argument is provided
        }

        String user_input = args[0];
        System.out.println(user_input instanceof String);
        System.out.println(user_input);

        // Check if the input is a valid integer
        if (!user_input.matches("\\d+")) {
            System.out.println("Invalid input: " + user_input + " is not a valid number.");
            return; // Exit the program if input is invalid
        }

        int age = Integer.parseInt(user_input); // Safe to parse now

        String result = (age < 18) ? "Minor" : (age < 65) ? "Adult" : "Senior Citizen";
        System.out.println(result);
    }
}