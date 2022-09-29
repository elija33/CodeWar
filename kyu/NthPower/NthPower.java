package NthPower;

public class NthPower {
    public static int NthPower(int number[], int numbers) {
        int total = -1;
        if (numbers < number.length) {
            total = 1;
            for (int i = 0; i < numbers; i++) {
                total *= number[numbers];
            }
        }
        return total;
    }
}
