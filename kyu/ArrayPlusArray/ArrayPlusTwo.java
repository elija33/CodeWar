package ArrayPlusArray;

public class ArrayPlusTwo {
    public static int ArrayPlusArray(int number[], int numbers[]) {
        int sum = 0;
        for (int i = 0; i < number.length; i++) {
            sum += number[i] + numbers[i];
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
