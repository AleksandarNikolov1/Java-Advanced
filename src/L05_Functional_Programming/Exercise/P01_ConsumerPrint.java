package L05_Functional_Programming.Exercise;

import java.util.Scanner;
import java.util.function.Consumer;

public class P01_ConsumerPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = sc.nextLine().split("\\s+");

        Consumer<String> print = System.out::println;

        for (String name : names) {
            print.accept(name);
        }
    }
}
