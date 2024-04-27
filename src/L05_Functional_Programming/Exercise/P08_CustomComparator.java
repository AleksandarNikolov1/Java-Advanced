package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class P08_CustomComparator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] numbersAsStrings = sc.nextLine().split("\\s+");
        Integer[] numbers = new Integer[numbersAsStrings.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(numbersAsStrings[i]);
        }

        Arrays.sort(numbers, new CustomComparator());

        for (Integer number : numbers) {
            System.out.print(number + " ");
        }
    }

    private static class CustomComparator implements Comparator<Integer> {
        @Override
        public int compare(Integer num1, Integer num2) {
            if (num1 % 2 == 0 && num2 % 2 != 0)
                return -1;

            else if (num1 % 2 != 0 && num2 % 2 == 0)
                return 1;

            else
                return Integer.compare(num1, num2);
        }
    }
}
