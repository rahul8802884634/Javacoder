package StringInterviewQuestions;

public class ReverseString {
    public static void main(String[] args) {
       String name = "chutiya";
       for(int i=name.length()-1;i>=0;i--)
       {
           System.out.print(name.charAt(i));
       }

    }
}