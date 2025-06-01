package StringInterviewQuestions;

public class Bufferclassreversestring {
    public static void main(String[]args)
    {
        String reversedstring ="";
        String original = "Tester";
        StringBuffer sb  = new StringBuffer(original);
        reversedstring = sb.reverse().toString();
        System.out.println(reversedstring);
    }
}
