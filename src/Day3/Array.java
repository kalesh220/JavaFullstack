package Day3;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        int[] arr = new int[5];
        assigningValues(arr);
        retrievingValues(arr);
        sumAvg(arr);
    }

    public static void assigningValues(int[] arr) {
        int index = 0;
        Random num = new Random();
        while (index < arr.length) {
            arr[index] = num.nextInt(100);
            index++;
        }
    }

    public static void retrievingValues(int[] array) {
        int index = 0;
        while (index < array.length) {
            System.out.println(array[index]);
            index++;
        }
    }

    public static void sumAvg(int[] array) {
        int index = 0;
        int sum = 0;
        int count = 0;
        while (index < array.length) {
            sum += array[index];
            index++;
            count++;
        }
        System.out.println("sum of elements in an array : "+sum);
        System.out.println("Average od elements in an array : "+(sum/count));

    }
}
