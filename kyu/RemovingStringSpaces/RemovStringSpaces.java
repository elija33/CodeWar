package RemovingStringSpaces;

public class RemovStringSpaces {
    public static String noSpace(final String word) {
        // loop thought the whloe string.
        // Remplace " " to "".
        return word.replaceAll("\\s+", "");
    }
}
