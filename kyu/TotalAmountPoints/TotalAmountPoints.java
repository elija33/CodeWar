package TotalAmountPoints;

public class TotalAmountPoints {
    public static int points(String[] gamesTime) {
        String[] subStr;
        String delimeter = ":";
        int comand = 0;
        int comand1 = 0;
        int points = 0;
        for (int i = 0; i < gamesTime.length - 1; i++) {
            for (int j = 0; j < 2; j++) {
                subStr = gamesTime[i].split(delimeter);
                if (j == 0) {
                    comand = Integer.parseInt(subStr[j]);
                } else {
                    comand1 = Integer.parseInt(subStr[j]);
                }
            }
            if (comand > comand1) {
                points += 3;
            } else if (comand < comand1) {
                points += 0;
            } else if (comand == comand1) {
                points += 1;
            }
        }
        return points;
    }

    public static void main(String[] args) {

    }
}
