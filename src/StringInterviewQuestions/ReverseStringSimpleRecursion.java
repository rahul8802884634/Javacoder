package StringInterviewQuestions;
public class ReverseStringSimpleRecursion {
    public static void main(String[] args) {
        String str = "Rahul";
        String reversed = reverse(str);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverse(String str) {
        if (str.isEmpty()) {
            return str;
        }
        return reverse(str.substring(1)) + str.charAt(0);
    }
}
