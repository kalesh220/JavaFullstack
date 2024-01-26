package Day1;

import java.util.Scanner;

public class ProductOfFloatNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Float Numbers :");
        float f1 = sc.nextFloat();
        System.out.println("Enter Second Float Number : ");
        float f2 = sc.nextFloat();

        float f3 = f1*f2;
        System.out.println("Product of two float Numbers :"+f3);
        sc.close();
    }
}
