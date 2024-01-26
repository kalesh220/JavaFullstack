package Day1;

import java.util.Scanner;

public class TemperatureConverter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to temperature converter ");
        System.out.println("/n Enter temperature in F :");
        float fah = sc.nextFloat();
        float cel = (fah-32)*5/9;

        System.out.println("Temperature "+cel+" C");
    }
}
