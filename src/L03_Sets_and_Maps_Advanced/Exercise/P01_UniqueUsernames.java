package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_UniqueUsernames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Set<String> names = new LinkedHashSet<>();

        while (n-- > 0){
            names.add(sc.nextLine());
        }

        for (String name : names) {
            System.out.println(name);
        }
    }
}
