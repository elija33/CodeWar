package InvertValues;

public class InvertValues {
    public static int[] InvertValues(int number[]) {
        for (int i = 0; i < number.length; i++) {
            number[i] *= -1;
        }
        return number;
    }

    public static void main(String[] args) {
        int number[] = { -1, -2, -3, -4, -5 };
        System.out.println(number);
    }
}
