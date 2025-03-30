package ex_14_Arrays;

public class lab_76_arrange_min_values {
    public static void main(String[] args) {
        int[] array={21,34,17,76,54,3,76};
        int min_output =give_min(array);
        System.out.println(min_output);
    }
    static int give_min(int[] array) {
        int min=array[0];
        for (int i=0;i< array.length;i++) {
            if(array[i]<min){
                min= array[i];
        }
        }
        return min;
    }
}
