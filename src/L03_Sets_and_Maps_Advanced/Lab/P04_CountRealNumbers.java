package L03_Sets_and_Maps_Advanced.Lab;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P04_CountRealNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] realNumbers = Arrays.stream(sc.nextLine().split(" "))
                .mapToDouble(Double::parseDouble).toArray();

        Map<Double, Integer> realNumbersCounter = new LinkedHashMap<>();

        for (double n : realNumbers) {
            realNumbersCounter.putIfAbsent(n, 0);
            realNumbersCounter.put(n, realNumbersCounter.get(n) + 1);
        }

        realNumbersCounter.forEach((key, value) -> System.out.printf("%.1f -> %d%n", key, value));

    }
}
