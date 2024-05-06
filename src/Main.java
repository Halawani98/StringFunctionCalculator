import calculator.StringFunctionCalculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter value of source string t: ");
        String t = scanner.nextLine();
        StringFunctionCalculator.findMaxSubstringValue(t);
    }
}