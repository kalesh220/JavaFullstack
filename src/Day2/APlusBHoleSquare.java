package Day2;

import java.util.Scanner;


public class APlusBHoleSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("A plus B hole Square solution \n");
        System.out.println("Enter first value :");
        int a = input.nextInt();
        System.out.println("Enter second value :");
        int b = input.nextInt();

        int square = (a+b)*(a+b);
        int temp = (a*a+b*b+2*a*b);

        if(square == temp){
            System.out.println("A plus B hole square formulae is correct");
        }else {
            System.out.println("A plus B hole square formulae is wrong");
        }

    }

    }

