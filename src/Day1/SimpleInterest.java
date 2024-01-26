package Day1;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter principle amount :");
        double principleAmount = sc.nextDouble();
        System.out.println("Enter no of months :");
        int time = sc.nextInt();
        System.out.println("Enter rate of interest :");
        double interestRate = sc.nextDouble();

        double simpleInterest = (principleAmount*time*interestRate)/100;
        System.out.println("Principle Amount :"+principleAmount);
        System.out.println("Duration in months :"+time);
        System.out.println("Rate of interest :"+interestRate);
        System.out.println("total interest :"+simpleInterest);
    }
}
