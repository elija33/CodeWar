package MultiplicationTableNumber;

public class Multiplicationtable {
    public static String multiTable(int number) {
        String numbers = " ";
        for (int i = 0; i < 10; i++) {
            numbers += (Integer.toString(i) + "*" + Integer.toString(number) + " = " + Integer.toString(i * number)
                    + "\n");
        }
        return numbers.substring(0, numbers.length() - 1);
    }

    public static void main(String[] args) {
        int number = 2;
        System.out.println(multiTable(number));
    }
}
