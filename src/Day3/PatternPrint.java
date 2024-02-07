package Day3;

import java.util.Scanner;

public class PatternPrint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to pattern print \n ");
        System.out.println("Please Enter number :");
        int num = input.nextInt();
        PatternPrint pt = new PatternPrint();
        pt.rightPyramid(num);
        pt.leftPyramid(num);
    }
    public void rightPyramid(int n1){
        int index = 0;

        while(index < n1){
            int index1 = 0;
            System.out.print("*"+" ");
            while (index1 < index){
                System.out.print("*"+" ");
                index1++;
            }
            System.out.println();
            index++;
        }
    }
    public void leftPyramid(int n2){
        int index = n2;
        while(index>=0){
            int index1 = 0;
            System.out.print("");
            while(index1 < index){
                System.out.print("*"+" ");
                index1++;
            }

            System.out.println();
            index--;
        }
    }

}
