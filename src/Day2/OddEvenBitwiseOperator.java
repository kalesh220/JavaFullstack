package Day2;

import java.util.Scanner;

public class OddEvenBitwiseOperator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = input.nextInt();
        if((num & 1) ==0){
            System.out.println("you have entered even number");
        }else{
            System.out.println("you have entered odd number");
        }
    }
}
