package Day1;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to year calculator \n");
        System.out.println("please enter year :");
        int year = input.nextInt();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println(year + " is leap year");
        } else {
            System.out.println(year + " is not a leap year");
        }
    }
}
