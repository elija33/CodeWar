package ArrayPlusArray;

public class ArrayPlus {
    public static String stringName(String name) {
        return (name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1)).toUpperCase();
    }

    public static void main(String[] args) {
        System.out.println(stringName("Elija Amponsah"));
    }
}
