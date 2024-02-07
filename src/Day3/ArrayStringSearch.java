package Day3;

import java.util.Scanner;

public class ArrayStringSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] strArray = {"Kalesh", "Ramesh", "Swathi", "Kranthi", "Bhanu"};
        System.out.println("Welcome array string search \n");
        System.out.println("Please Enter string you want to search :");
        String str = sc.next();
        String isFound = arraySearch(strArray, str);
        System.out.println("your are required string is "+isFound);

    }
    public static String arraySearch(String[] stArray, String str){
        int index= 0;
        while(index < stArray.length){
            if(stArray[index].equals(str)){
                return stArray[index];
            }
            index++;
        }
        return "not found";
    }
}
