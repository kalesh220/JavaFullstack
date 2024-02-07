package Day2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to table expresses \n");
        System.out.println("Enter number which table you want :");
        int num = input.nextInt();
        int i = 1;
        while (i <= 20) {
            System.out.println(num + " X " + i + " = " + (num * i));
            i++;
        }
    }
}
