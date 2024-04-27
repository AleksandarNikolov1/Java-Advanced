package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P05_ReverseAndExclude {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> list = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        int divisor = Integer.parseInt(sc.nextLine());

        Collections.reverse(list);

        list.stream().filter(n -> n % divisor != 0).forEach(n -> System.out.print(n + " "));
    }
}
