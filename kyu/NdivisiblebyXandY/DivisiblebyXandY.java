import java.util.Random;

public class DivisiblebyXandY {
    public static boolean divisible(int number, int first, int second) {
        if (number % first == 0 && number % second == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
    }

}