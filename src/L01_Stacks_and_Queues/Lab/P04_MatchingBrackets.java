package L01_Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P04_MatchingBrackets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expression = sc.nextLine();
        ArrayDeque<Integer> stack = new ArrayDeque<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(') {
                stack.push(i);
            } else if (c == ')') {
                int starIndex = stack.pop();
                String content = expression.substring(starIndex, i + 1);
                System.out.println(content);
            }
        }
    }
}


