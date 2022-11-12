package ConvertStringToNumber;

public class StrintToNumber {
    public static int StringToNumbers(String name) {
        int number = Integer.parseInt(name);
        return number;
    }

    public static void main(String[] args) {
        String number = "1234";
        String numbers = "23435";
        System.out.println(StringToNumbers(numbers));
        System.out.println(StringToNumbers(number));
    }
}
