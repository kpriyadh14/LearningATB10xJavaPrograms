package ex_13_String_functions;

public class lab_70_string {
    public static void main(String[] args) {
        String s1= "Hello";
        String s2 = "world";
        String s3 = s1+s2;
        System.out.println(s3);
        System.out.println(s1.concat(s2));

        StringBuilder StringBuilder = new StringBuilder("Priya");
        StringBuilder.append("Dharshini");
        System.out.println(StringBuilder);
        // StringBuffer , StringBuilder - 2 more ways to create strings.
    }
}
