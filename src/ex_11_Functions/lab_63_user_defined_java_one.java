package ex_11_Functions;

import java.util.Scanner;

public class lab_63_user_defined_java_one {
    public static void main(String[] args) {
        // User Defined Functions.
        // 1. Without Parameters and Without Return Type
//        greet();
//        // 2. Without Parameters but With Return Type
//        String s = greet_with_hello();
//        System.out.println(s);
//        int vote = age_to_vote();
//        System.out.println("Age to vote is-> "+vote);

 //       greet_with_name("Priya");
//        greet_with_fullname("Priya", "Dharshini");
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter name");
//        String name = sc.next();
//        System.out.println("Enter age");
//        int age = sc.nextInt();
//        System.out.println("Enter salary");
//        double salary =sc.nextDouble();

       // greet_with_details(name,age,salary);

        int sum = sum_of_two_numbers(3,4);
        System.out.println(sum);
    }
//        // 1. Without Parameters and Without Return Type. (Declare) /Define
//        static void greet () {
//            System.out.println("Hi, how are you");
//        }
//        //  2. Without Parameters but With Return Type
//        static String greet_with_hello () {
//            return "Hi, how are you";
//        }
//        static int age_to_vote(){
//        System.out.println("calculating age");
//        return 18;
//        }

    //3. With Paramaters and no return type
    static void greet_with_name(String name) {
        System.out.println("Hi your name is " + name);
    }

    static void greet_with_fullname(String firstname, String lastname) {
        System.out.println(firstname + lastname);
    }

    static void greet_with_details(String name, String age, String salary) {
        System.out.println(name + age+ salary);
    }
    //4. With Paramaters and with return type

    static int sum_of_two_numbers(int a , int b){
        return a+b;
    }
}
        //static void greet_with_details(String name, String age, String salary);