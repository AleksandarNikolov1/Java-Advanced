package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.*;

public class P03_PeriodicTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Set<String> chemicalCompounds = new TreeSet<>();

        while (n-- > 0) {
            chemicalCompounds.addAll(List.of(sc.nextLine().split("\\s+")));
        }


        System.out.println(String.join(" ", chemicalCompounds));
    }
}
