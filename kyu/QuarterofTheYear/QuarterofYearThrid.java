package QuarterofTheYear;

public class QuarterofYearThrid {
    public static int quarterOf(int month) {
        return (month - 1) / 3 + 1;
    }

    public static void main(String[] args) {
        System.out.println(quarterOf(7));
    }
}
