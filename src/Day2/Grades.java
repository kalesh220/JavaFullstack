package Day2;

import java.util.Scanner;

public class Grades {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to grading system \n");
        System.out.println("Please enter your telugu marks :");
        float telugu = input.nextFloat();

        System.out.println("Please enter your Hindi marks :");
        float hindi = input.nextFloat();

        System.out.println("Please enter your English marks :");
        float english = input.nextFloat();

        System.out.println("Please enter your Mathematics marks :");
        float maths = input.nextFloat();

        System.out.println("Please enter your Science marks :");
        float science = input.nextFloat();

        System.out.println("Please enter your Social marks :");
        float social = input.nextFloat();

        float total = telugu+hindi+english+maths+science+social;
        float percentage = total/600*100;
        System.out.println("Your percentage is: "+percentage);
        if(percentage>=90){
            System.out.println("you got A Grade, keep it up");
        } else if (percentage>=70) {
            System.out.println("you have got 'B' Grade, little bit study harder");
        } else if (percentage>=55) {
            System.out.println("you have got 'C' Grade, study harder to better future");
        } else if (percentage>=35) {
            System.out.println("You have got 'D' Grade, study very harder ");
        }else {
            System.out.println("You have Failed");
        }


    }
}
