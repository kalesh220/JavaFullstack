package Day1;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println(" Hello welcome to number checker \n");
        System.out.println("Please enter number :");
        int num = input.nextInt();
        if(num%2 == 0){
            System.out.println("Entered number is even");
        } else{
            System.out.println("Entered number is odd");
        }

    }
}
