package calculator;

public class StringFunctionCalculator {

    public static void findMaxSubstringValue(String t) {
        t = t.toLowerCase();
        int maxValue = 0;
        for(int i = 0; i < t.length(); i++) {
            for (int j = i + 1;  j <= t.length(); j++) {
                String s = t.substring(i, j);
                int value = s.length() * numSubstrings(t, s);
                maxValue = Math.max(maxValue, value);
            }
        }
        System.out.println(maxValue);
    }

    private static int numSubstrings(String t, String s) {
        int numSubStrings = 0;
        int index = 0;
        while ((index = t.indexOf(s, index)) != -1) {
            numSubStrings++;
            index += s.length();
        }
        return numSubStrings;
    }
}
