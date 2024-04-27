package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P04_CountSymbols {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[] chars = sc.nextLine().toCharArray();

        Map<Character, Integer> charsCounter = new TreeMap<>();

        for (char c : chars) {
            charsCounter.putIfAbsent(c, 0);
            charsCounter.put(c, charsCounter.get(c) + 1);
        }

        for (var entry : charsCounter.entrySet()) {
            System.out.printf("%c: %d time/s%n", entry.getKey(), entry.getValue());
        }
    }
}
