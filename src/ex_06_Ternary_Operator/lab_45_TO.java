package ex_06_Ternary_Operator;

public class lab_45_TO {
    public static void main(String[] args) {
        //Nested ternary
        // result = condition? expression1: (condition? expression2: expression3);
        int num = 15;
        String result = (num>10)?(num>20? "G>20":"Between 10 to 20"):"B";
        System.out.println(result);
    }
}
