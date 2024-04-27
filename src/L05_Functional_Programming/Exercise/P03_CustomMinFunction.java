package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.Function;

public class P03_CustomMinFunction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] inputArr = sc.nextLine().split("\\s+");

        Integer[] intsArr = new Integer[inputArr.length];

        for (int i = 0; i < intsArr.length; i++) {
            intsArr[i] = Integer.parseInt(inputArr[i]);
        }

        Function<Integer[], Object> findMinFunction = arr -> Arrays.stream(intsArr).min(Integer::compare)
                        .get();

        System.out.println(findMinFunction.apply(intsArr));
    }
}
