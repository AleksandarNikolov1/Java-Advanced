package L05_Functional_Programming.Exercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class P02_KnightsOfHonor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");

        Consumer<String> print = name -> System.out.println("Sir " + name);

        for (String name : names) {
            print.accept(name);
        }
    }
}
