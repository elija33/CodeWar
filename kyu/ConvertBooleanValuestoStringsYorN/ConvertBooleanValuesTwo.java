package ConvertBooleanValuestoStringsYorN;

public class ConvertBooleanValuesTwo {
    public static String boolToWord(boolean b) {
        if (b) {
            return "yes";
        }
        return "no";
    }

    public static void main(String[] args) {
        System.out.println(boolToWord(false));
    }
}
