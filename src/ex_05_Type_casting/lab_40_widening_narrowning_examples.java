package ex_05_Type_casting;

public class lab_40_widening_narrowning_examples {
    public static void main(String[] args) {
        int course =100;
        float GST =18.85f;
        //int total_value = course+GST; //narrowing implicit
        int total_value1 = course+(int)GST; // narrowing explicit
        float total_cost =course+GST;// Widening implicit
        float total_cost1 = (float)course+GST;  // Widening explicit
        System.out.println(total_cost1);
    }
}
