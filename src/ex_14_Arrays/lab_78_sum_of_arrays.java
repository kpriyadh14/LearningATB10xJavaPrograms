package ex_14_Arrays;

public class lab_78_sum_of_arrays {
    public static void main(String[] args) {
        int[] numbers ={12,30,40};
        int sum=0;
        for(int i=0;i< numbers.length;i++){
            sum=sum+numbers[i];
        }
        System.out.println(sum);
    }
}
