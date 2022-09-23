package AbbreviateTwoWordName;

public class AbbreviateTwoWordName {
    public static String abbrevName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }
}
