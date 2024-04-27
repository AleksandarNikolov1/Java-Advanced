package L01_Stacks_and_Queues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P02_BasicStackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] input = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int N = input[0];
        int S = input[1];
        int X = input[2];

        int[] numbers = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();

        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            stack.push(numbers[i]);
        }

        for (int i = 0; i < S; i++) {
            stack.pop();
        }

        if (stack.contains(X))
            System.out.println("true");

        else{
            stack.stream().min(Integer::compare).ifPresent(System.out::println);
        }

        if (stack.isEmpty())
            System.out.println(0);
    }
}
