package ex_12_Strings;

public class lab_66_interview_ques {
    public static void main(String[] args) {
        String s1="Hello";
        String s2= "Hello";

        String s3 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s5.equalsIgnoreCase(s4));
    }
}
