package FindMaximumAndMinimumValu;

import java.util.Arrays;

public class MaximumMinimum {

    public static int Minimum(int number[]) {
        // Sort All the elements in the array
        Arrays.sort(number);
        // Return the smallest element in the array
        return number[0];
    }

    public static int Maximum(int number[]) {
        // Sort All the elements in the array
        Arrays.sort(number);
        // Return the Maximum Elements in the array
        return number[number.length - 1];
    }

    public static void main(String[] args) {
        int number[] = { 44, 66, 99, 77, 33, 22, 55 };
        System.out.println("The bigest number in the array is :" + " " + Maximum(number));
        System.out.println();
        System.out.println("The small number in array is :" + " " + Minimum(number));
    }
}
