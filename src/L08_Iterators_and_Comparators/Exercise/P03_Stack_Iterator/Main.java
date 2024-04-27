package L08_Iterators_and_Comparators.Exercise.P03_Stack_Iterator;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        CustomStack stack = new CustomStack();

        while (!input.equals("END")) {

            if (input.contains("Push")) {
                Pattern pattern = Pattern.compile("[0-9]+");
                Matcher matcher = pattern.matcher(input);

                while (matcher.find()) {
                    stack.push(Integer.parseInt(matcher.group()));
                }
            } else if (input.equals("Pop")) {
                if (!stack.isEmpty())
                    stack.pop();
            }

            input = sc.nextLine();
        }

        if (!stack.isEmpty()) {
            for (int i = 0; i < 2; i++) {
                for (Integer integer : stack) {
                    System.out.println(integer);
                }
            }
        } else
            System.out.println("No elements");


    }
}
