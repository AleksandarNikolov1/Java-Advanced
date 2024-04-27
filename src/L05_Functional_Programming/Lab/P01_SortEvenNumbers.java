package L05_Functional_Programming.Lab;

import java.util.Arrays;
import java.util.Scanner;

public class P01_SortEvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] ints = Arrays.stream(sc.nextLine().split(", "))
                .mapToInt(Integer::parseInt).filter(n -> n % 2 == 0).toArray();

        printArray(ints);

        Arrays.sort(ints);

        printArray(ints);
    }

    private static void printArray(int[] arr){
        System.out.println(String.join(", ", Arrays.toString(arr))
                .replace("[", "").replace("]", ""));
    }
}
