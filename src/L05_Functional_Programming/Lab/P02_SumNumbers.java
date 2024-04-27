package L05_Functional_Programming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.IntStream;

public class P02_SumNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Function<String, IntStream> getIntStream = arr -> Arrays.stream(input.split(", "))
                .mapToInt(Integer::parseInt);

        Function<String, Integer> getSum = str -> getIntStream.apply(str).sum();
        Function<String, Long> getCount = str -> getIntStream.apply(str).count();

        System.out.println("Count = " + getCount.apply(input));
        System.out.println("Sum = " + getSum.apply(input));
    }
}
