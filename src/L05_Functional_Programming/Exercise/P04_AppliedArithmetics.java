package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P04_AppliedArithmetics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Integer> ints = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toList());

        String command = sc.nextLine();

        while (!command.equals("end")){

            switch (command){
                case "add":
                    add(ints);
                    break;
                case "multiply":
                    multiply(ints);
                    break;
                case "subtract":
                    subtract(ints);
                    break;
                case "print":
                    print(ints);
                    break;
            }

            command = sc.nextLine();
        }

    }

    private static void add(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) + 1);
        }
    }

    private static void subtract(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) - 1);
        }
    }

    private static void multiply(List<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            list.set(i, list.get(i) * 2);
        }
    }

    private static void print(List<Integer> list){
        System.out.println();
        list.forEach(n -> System.out.print(n + " "));
    }
}
