package ex_14_Arrays;

import java.util.Arrays;

public class lab_79_second_largest_number {
    public static void main(String[] args) {
        int[] numbers ={23,45,54,32,11};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length -2]);

    }
}
