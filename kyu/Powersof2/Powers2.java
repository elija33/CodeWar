package Powersof2;

public class Powers2 {
    public static double powersOfTwo(int number) {
        for (int i = 0; i < number; i++) {
            return Math.pow(number, i);
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(powersOfTwo(3));
    }
}
