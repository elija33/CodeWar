package ConvertBooleanValuestoStringsYorN;

//Convert boolean values to strings "yes" or "no".
public class ConvertBooleanValues {
    public static String boolToWord(boolean word) {
        return word ? "Yes" : "No";
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println(boolToWord(false));
        System.out.println(boolToWord(true));
    }
}
