package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class P07_FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> integers = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        Function<List<Integer>, Integer> findSmallestEl =
                list -> list.lastIndexOf(list.stream().min(Integer::compare).orElse(null));

        System.out.println(findSmallestEl.apply(integers));
    }
}
