package AbbreviateTwoWordName;

public class EfficiAbbrevTwoWordName {
    public static String abbrevName(String name) {
        // Create String of array
        String[] stringname = name.split(" ");

        // Set the first element of the array to UpperCase
        String firstWord = stringname[0].toUpperCase();

        // Set the first the element of the second array to UpperCase
        String lastWord = stringname[1].toUpperCase();

        // Getting the first element of the first array to characters
        char firschar = firstWord.charAt(0);

        // Getting the first element of the second array to characters
        char lastchar = lastWord.charAt(1);

        // Add the first charact and the second charact and set it up to word.
        String word = firschar + "." + lastchar;
        return word;
    }
}
