package ex_05_Type_casting;

public class lab_38_type_casting_Widening {
    public static void main(String[] args) {
        byte b =10;
        //int a =b; // Widening implicit
        int a = (int)b;// Widening Explicit
        System.out.println(a);
    }
}
