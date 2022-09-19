package kyu.CalculateAverage;

public class calculateave {
    public static double find_average(int[] number) {
        double sum = 0;
        for (int i = 0; i < number.length - 1; i++) {
            sum = sum + number[i];
            double avg = (sum / number.length);
            return avg;
        }
        return -1;
    }

    public static void main(String[] args) {

    }
}
