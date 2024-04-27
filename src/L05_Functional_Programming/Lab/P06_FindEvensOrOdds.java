package L05_Functional_Programming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P06_FindEvensOrOdds {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] bounds = Arrays.stream(sc.nextLine().split(" "))
                .mapToInt(Integer::parseInt).toArray();

        int from = bounds[0];
        int to = bounds[1];

        String evenOrOdds = sc.nextLine();

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Predicate<Integer> isOdd = n -> n % 2 != 0;

        Consumer<Integer> printer = n -> System.out.print(n + " ");

        for (int num = from; num <= to; num++) {
            if (evenOrOdds.equals("even")) {
                if (isEven.test(num))
                    printer.accept(num);
            } else {
                if (isOdd.test(num))
                    printer.accept(num);
            }
        }
    }
}
