package SwitchItUp;

public class SwititUp {
    public static String switchItUp(int number) {
        if (number == 1) {
            return "One";
        }
        if (number == 2) {
            return "Two";
        }
        if (number == 3) {
            return "Three";
        }
        if (number == 4) {
            return "Four";
        }
        if (number == 5) {
            return "Five";
        }
        if (number == 6) {
            return "Six";
        }
        if (number == 7) {
            return "Seven";
        }
        if (number == 8) {
            return "Eight";
        }
        if (number == 9) {
            return "Nine";
        }
        return "Not find";
    }

    public static void main(String[] args) {
        System.out.println(switchItUp(6));
    }
}
