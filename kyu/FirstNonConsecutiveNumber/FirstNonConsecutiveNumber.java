package kyu.FirstNonConsecutiveNumber;

public class FirstNonConsecutiveNumber {
    public static Integer findNocConsecutiveNumber(final int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i + 1] != number[i] + 1) {
                return number[i + 1];
            }
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
