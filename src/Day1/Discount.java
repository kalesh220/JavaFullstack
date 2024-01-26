package Day1;

import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter BillAmount :");
        double billAmount = sc.nextDouble();
        double discount = 0;
        double netAmount;
        if (billAmount >= 1000) {
            discount = billAmount * 0.1;
            netAmount = billAmount - discount;
        } else {
            netAmount = billAmount;
        }
        System.out.println("Bill Amount = " + billAmount);
        System.out.println("Discount    =" + discount);
        System.out.println("Net Amount  =" + netAmount);
    }
}
