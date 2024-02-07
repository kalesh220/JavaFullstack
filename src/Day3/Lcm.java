package Day3;

import java.util.Scanner;

public class Lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number :");
        int n1 = input.nextInt();
        System.out.println("Enter Second Number :");
        int n2 = input.nextInt();
        int lcm = LcmOfTwoNumbers(n1, n2);
        System.out.println("LCM of " + n1 + " and " + n2 + " is :" + lcm);

    }
    public static int LcmOfTwoNumbers(int num1, int num2) {
        int i = 1;
        int factor;
        while (true) {
            factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }
            i++;
        }

    }
}
