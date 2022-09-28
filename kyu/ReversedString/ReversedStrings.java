package ReversedString;

public class ReversedStrings {
    public static String solution(String word) {
        return new StringBuilder(word).reverse().toString();
    }

    public static void main(String[] args) {
        System.out.println(solution("Hello I am here wit you"));
    }

}
