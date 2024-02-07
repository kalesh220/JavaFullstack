package Day3;
import java.util.Random;
public class TwoDArray {
    public static void main(String[] args) {
        int[][] numericArray = new int[3][3];
        TwoDArray tda = new TwoDArray();
        tda.assigningValuesToArray(numericArray);
        tda.retrievingValuesFromArray(numericArray);
        tda.sumAvg(numericArray);
    }
    public void assigningValuesToArray(int[][] numericArray) {
        System.out.println("Values assigning is started \n");
        Random rand = new Random();
        int i = 0;
        while (i < numericArray.length) {
            int j = 0;
            while (j < numericArray.length) {
                numericArray[i][j] = rand.nextInt(50);
                j++;
            }
            System.out.println();
            i++;
        }
        System.out.println("Values assigned...................!\n");
    }
    public void retrievingValuesFromArray(int[][] numericArray) {
        System.out.println("Values retrieving is started ");
        int index = 0;
        while (index < numericArray.length) {
            int index2 = 0;

            while (index2 < numericArray.length) {
                System.out.print(numericArray[index][index2] + " ");
                index2++;
            }
            System.out.println();
            index++;
        }
        System.out.println("Values Retrieved...............! \n");
    }
    public void sumAvg(int[][] numericArray) {
        int i = 0;
        int sum = 0;
        int count = 0;
        while (i < numericArray.length) {
            int j = 0;
            while (j < numericArray.length) {

                sum += numericArray[i][j];
                count++;
                j++;
            }
            i++;
        }
        System.out.println("Sum of all elements in an array is " + sum);
        System.out.println("Average of all elements in an array is " + (sum / count));
    }
}
