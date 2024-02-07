package Day2;

import java.util.Scanner;

public class Function {
    public static void main(String[] args) {
        Function fn = new Function();
        int num = pattern1();

        int sum = oddNumSum(num);
        System.out.println("Odd Numbers Sum is :"+sum +"\n");

        int fac = fn.factorial(num);
        System.out.println("Factorial of given Number is :"+fac);



    }

    public static int pattern1() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        return input.nextInt();

    }

    public static int oddNumSum(int N) {
        int i = 1;
        int oddSum = 0;
        while (i <= N) {
            if (i % 2 != 0) {
                oddSum = oddSum + i;
            }
            i++;
        }
        return oddSum;
    }

    public int factorial(int N){
        int i=1;
        int fact = 1;
        while(i<=N){
            fact=fact*i;
            i++;
        }
        return fact;
    }
}
