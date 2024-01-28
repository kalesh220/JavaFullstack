package Day1;

import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number :");
        int num = input.nextInt();

        if(num<0){
            System.out.println("you have entered negative number");
        } else if (num>0) {
            System.out.println("you have entered positive number");
        }else{
            System.out.println("you have entered zero");
        }
    }
}
