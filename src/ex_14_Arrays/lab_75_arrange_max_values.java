package ex_14_Arrays;

public class lab_75_arrange_max_values {
    public static void main(String[] args) {
        int[] array = {23, 14, 54, 88, 76, 89};

        int max_output = give_max(array);
        System.out.println(max_output);
    }
        static int give_max(int[] array) {
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }
            }
            return max;
        }
    }

