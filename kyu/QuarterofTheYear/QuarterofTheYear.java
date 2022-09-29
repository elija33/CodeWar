package QuarterofTheYear;

public class QuarterofTheYear {
    public static int quarterOf(int month) {
        int months = 0;
        if (month <= 3) {
            months = 1;
        } else if (month <= 6 && month > 3) {
            months = 2;
        } else if (month <= 9 && month > 6) {
            months = 3;
        } else if (month <= 12 && month > 9) {
            months = 4;
        }
        return months;
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(10));
    }
}
