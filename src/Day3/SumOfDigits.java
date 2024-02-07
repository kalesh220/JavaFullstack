package Day3;

import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args) {

        SumOfDigits sd = new SumOfDigits();
        int N = sd.scan();
        int digitsSum = sd.sumDigits(N);
        System.out.println("Sum of Digits is :"+digitsSum);
    }
    public int scan(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter number :");
        return sc.nextInt();
    }
    public int sumDigits(int num){
        int sum = 0;
        while(num>0){
            sum = sum + num%10;
            num=num/10;
        }
        return sum;
    }
}
