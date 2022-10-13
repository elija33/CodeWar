package FindNearestSquareNumber;

public class NearestSquareNumber {
    public static int nearestSq(final int number) {
        int total = (int) Math.pow(Math.round(Math.sqrt(number)), 2);
        return total;

    }

    public static void main(String[] args) {
        int number = 2;
        System.out.println(nearestSq(number));
    }
}
