package ex_12_Strings;

public class lab_68_inter_ques {
    public static void main(String[] args) {
        String s1 ="Hello";
        String s3 = "Hello";

        String s2 = new String("Hello");
        String s4 = new String("Hello");
        String s5 = new String("hello");
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s5));
    }
}
