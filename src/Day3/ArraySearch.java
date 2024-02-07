package Day3;

import java.util.Scanner;

public class ArraySearch {
    public static void main(String[] args) {
        Scanner input =  new Scanner(System.in);
        int[] myArr = {10, 56, 98, 7, 6, 45, 87, 82, 54, 32, 29};
        System.out.println("welcome array searching \n");
        System.out.println("Please enter number you want to search :");
        int num = input.nextInt();
        boolean isFound = isFound(myArr, num);
        if(isFound){
            System.out.println("your number was found in array");
        }else {
            System.out.println("your number was not found in array");
        }
    }
    public static boolean isFound(int[] arr, int num ){
        int index = 0;
        while (index<arr.length){
            if(arr[index]==num){
                return true;
            }
            index++;
        }
        return false;
    }
}
