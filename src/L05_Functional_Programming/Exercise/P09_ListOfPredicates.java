package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Predicate;

public class P09_ListOfPredicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int bound = Integer.parseInt(sc.nextLine());

        int[] arr = Arrays.stream(sc.nextLine().split("\\s+"))
                .mapToInt(Integer::parseInt).toArray();

        Predicate<Integer> isDivisibleBy = num -> {
            for (int divisor : arr) {
                if (num % divisor != 0)
                    return false;
            }

            return true;
        };

        for (int i = 1; i <= bound; i++) {
            if (isDivisibleBy.test(i))
                System.out.print(i + " ");
        }
    }
}
