package L05_Functional_Programming.Lab;

import java.util.Scanner;
import java.util.function.Predicate;

public class P03_CountUppercaseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split("\\s+");
        Predicate<String> containsUpperCase = word -> {
            for (int i = 0; i < word.length(); i++) {
                if (Character.isUpperCase(word.charAt(i))){
                    return true;
                }
            }
            return false;
        };

        int counter = 0;

        StringBuilder sb = new StringBuilder();

        for (String string : input) {
            if (containsUpperCase.test(string)){
                sb.append(string).append(System.lineSeparator());
                counter++;
            }
        }

        System.out.println(counter);
        System.out.print(sb.toString());


    }
}
