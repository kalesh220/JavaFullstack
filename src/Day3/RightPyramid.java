package Day3;

import java.util.Scanner;

public class RightPyramid {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to pattern printing \n");
        System.out.println("Please Enter number :");
        int num = input.nextInt();
        int index = 0;
        while(index < num){
            int j = 0;
            System.out.print("*"+" ");
                while (j < index){
                System.out.print("*"+" ");
                j++;
                }
            System.out.println();
            index++;
        }
    }
}
