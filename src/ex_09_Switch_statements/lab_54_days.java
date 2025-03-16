package ex_09_Switch_statements;

import java.util.Scanner;

public class lab_54_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a day");
        int day = sc.nextInt();

        switch (day) {
            case 1:
                System.out.println("Its monday");
                break;
            case 2:
                System.out.println("Its tuesday");
                break;
            case 3:
                System.out.println("Its wed");
                break;
            case 4:
                System.out.println("Its thurs");
                break;
            case 5:
                System.out.println("Its friday");
                break;
            case 6:
                System.out.println("Its sat");
                break;
            case 7:
                System.out.println("Its sun");
                break;
            default:
                System.out.println("No idea what day it is");
        }
    }
}
