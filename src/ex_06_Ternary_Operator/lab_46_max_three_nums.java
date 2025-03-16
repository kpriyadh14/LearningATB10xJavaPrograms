package ex_06_Ternary_Operator;

public class lab_46_max_three_nums {
    public static void main(String[] args) {
        int n1= 4, n2= 7, n3=16;
        int result = (n1 >= n2) ? ((n1>= n3)? n1: n3): ((n2 >= n3)? n2 : n3);
        System.out.println(result);
    }
}
