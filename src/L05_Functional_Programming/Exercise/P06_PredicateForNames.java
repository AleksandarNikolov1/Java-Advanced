package L05_Functional_Programming.Exercise;

import java.util.Scanner;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class P06_PredicateForNames {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int conditionalLength = Integer.parseInt(sc.nextLine());

        String[] names = sc.nextLine().split("\\s+");

        Predicate<String> isValidLength = name -> name.length() <= conditionalLength;
        Consumer<String> print = System.out::println;

        for (String name : names) {
            if (isValidLength.test(name))
                print.accept(name);
        }
    }
}
