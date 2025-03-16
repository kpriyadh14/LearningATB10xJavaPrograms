package ex_08_if_else;

import java.util.Scanner;

public class lab_50_odd_even {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the integer");
        int num = sc.nextInt();
        if (num % 2 == 0) {
            System.out.println("Its even");
        } else {
            System.out.println("Its odd");
        }
    }
}