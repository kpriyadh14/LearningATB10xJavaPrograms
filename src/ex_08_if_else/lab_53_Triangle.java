package ex_08_if_else;

import java.util.Scanner;

public class lab_53_Triangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter triangle1 length");
        double side1 = sc.nextDouble();
        System.out.println("Enter triangle2 length");
        double side2 =sc.nextDouble();
        System.out.println("Enter triangle2 length");
        double side3= sc.nextDouble();
        if (side1 <= 0 || side2 <= 0 || side1 <=0) {
            System.out.println("Invalid input:Side length should be positive");
        }else {
            if (side1 == side2 && side2 == side3 && side1 == side3) {
                System.out.println("The triangle is equilateral ");
            } else if (side1 == side2 || side2 == side3 || side1 == side3) {
                System.out.println("The triangle is isoceleous ");
            } else {
                System.out.println("The triangle is scalene ");
            }
        }
    }
}
