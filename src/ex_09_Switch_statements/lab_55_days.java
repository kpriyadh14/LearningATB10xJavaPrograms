package ex_09_Switch_statements;

import java.lang.invoke.SwitchPoint;
import java.util.Scanner;

public class lab_55_days {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter browser name");
        String browser = sc.next();
        switch (browser){
            case "chrome":
                System.out.println("Starting the chrome browser");
                break;
            case "edge":
                System.out.println("Starting the edge browser");
                break;
            case "Safari":
                System.out.println("Starting the safari");
                break;
            default:
                System.out.println("No idea");
                break;

        }
    }
}
