package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P02_SetsOfElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] input = sc.nextLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);

        Set<Integer> firstSet = new LinkedHashSet<>();
        Set<Integer> secondSet = new LinkedHashSet<>();

        while (n-- > 0) {
            int num = Integer.parseInt(sc.nextLine());
            firstSet.add(num);
        }

        while (m-- > 0) {
            int num = Integer.parseInt(sc.nextLine());
            secondSet.add(num);
        }

        for (Integer num : firstSet) {
            if (secondSet.contains(num))
                System.out.print(num + " ");

        }


    }
}
