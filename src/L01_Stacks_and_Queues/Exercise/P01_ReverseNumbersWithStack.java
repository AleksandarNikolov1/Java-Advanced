package L01_Stacks_and_Queues.Exercise;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Scanner;

public class P01_ReverseNumbersWithStack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> stack = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt).forEach(stack::push);

        while (!stack.isEmpty()){
            System.out.print(stack.pop() + " ");
        }
    }
}
