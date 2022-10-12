package IsEven;

public class IsEven {
    public static boolean IsEven(double number) {
        if (number % 3 == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        double number = 4;
        System.out.println(IsEven(number));
    }
}
