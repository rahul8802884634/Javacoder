package ex_07_Increment_Decrement_Op;

public class Lab069_In_de_op {
    public static void main(String[] args) {
        // Check if enough arguments are provided
        if (args.length < 2) {
            System.out.println("Please provide at least two command line arguments: age and a float value.");
            return; // Exit the program if not enough arguments are provided
        }

        // Take inputs
        String age_string = args[0];
        String a1 = args[1];
        // Uncomment these lines if you want to use more arguments
        // String a2 = args[2];
        // String a3 = args[3];

        // Parse age
        int age = Integer.parseInt(age_string);
        System.out.println("Int -> " + age);

        // Print the inputs
        System.out.println("Age String: " + age_string);
        System.out.println("Float String: " + a1);
        // System.out.println("a2: " + a2);
        // System.out.println("a3: " + a3);

        // Parse float
        float f1 = Float.parseFloat(a1);
        System.out.println("Float -> " + f1);

        // Example operation (age_string = age_string / 4)
        // Note: This operation is not valid as age_string is a String.
        // You might want to perform some operation with the integer age instead.
        // For example:
        int result = age / 4;
        System.out.println("Age divided by 4: " + result);
    }
}
