package Alternatingcase;

public class AlternatingCase {
    public static String toAlternativeString(String str) {
        char[] word = str.toCharArray();
        for (int i = 0; i < word.length; i++) {
            if (Character.isAlphabetic(word[i])) {
                if (Character.isUpperCase(word[i])) {
                    word[i] = Character.toLowerCase(word[i]);
                } else {
                    word[i] = Character.toUpperCase(word[i]);
                }
            }
        }
        return new String(word);
    }

    public static void main(String[] args) {

    }
}
