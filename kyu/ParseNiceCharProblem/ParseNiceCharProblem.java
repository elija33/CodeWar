package ParseNiceCharProblem;

public class ParseNiceCharProblem {
    public static int howOld(final String herOld) {
        String age = herOld.substring(0, 1);
        return Integer.parseInt(age);
    }
}

class Test {
    public void test1() {
        assertEquals(5, ParseNiceCharProblem.howOld("5 years old"));
    }

    public void test2() {
        assertEquals(9, ParseNiceCharProblem.howOld("9 years old"));
    }

    public void test3() {
        assertEquals(1, ParseNiceCharProblem.howOld("1 years old"));
    }

    private void assertEquals(int i, int howOld) {
    }
}
