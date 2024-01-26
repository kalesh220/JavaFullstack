package Day1;

import java.util.Scanner;

public class Arithmetic {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int num1 = sc.nextInt();
        System.out.println("Enter Second Number :");
        int num2 = sc.nextInt();

        System.out.println("Addition of two numbers is :" + (num1 + num2));
        System.out.println("Multiplication of two numbers is :" + (num1 * num2));
        System.out.println("Division of two numbers is :" + num1 / num2);
        System.out.println("Remainder is :" + (num1 % num2));


    }
}
