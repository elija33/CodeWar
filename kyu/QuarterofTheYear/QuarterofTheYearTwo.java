package QuarterofTheYear;

public class QuarterofTheYearTwo {
    static final int number[] = { 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4 };

    public static int quarterOf(int month) {
        return number[month];
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(8));
    }
}
