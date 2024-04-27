package L01_Stacks_and_Queues.Lab;

import java.util.*;

public class P02_SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> expression = new ArrayDeque<>();
        String[] tokens = sc.nextLine().split("\\s+");

        Collections.addAll(expression, tokens);



        while (expression.size() > 1) {

            int first = Integer.parseInt(expression.pop());
            String operand = expression.pop();
            int second = Integer.parseInt(expression.pop());

            if (operand.equals("-"))
                expression.push(String.valueOf(first - second));

            else
                expression.push(String.valueOf(first + second));

        }

        System.out.println(expression.pop());
    }
}
