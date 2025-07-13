package Day1;

public class NumberSwap {
    public static void main(String[] args) {

        int a = 10;
        int b = 25;
        int c = a+b;
        a = c-a;
        b = c-a;
        System.out.println("Swapped number are " + a +" "+ b);
    }
}
