package ex_06_Ternary_Operator;

public class lab_47_age_classification {
    public static void main(String[] args) {
        // Minor
        // Adult
        // Senior
        int age = 35;
        String result = (age < 18)? "minor":(age > 65)? "Senior":"adult";
        System.out.println(result);

    }
}
