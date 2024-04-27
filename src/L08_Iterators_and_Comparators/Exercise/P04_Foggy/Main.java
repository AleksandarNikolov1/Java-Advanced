package L08_Iterators_and_Comparators.Exercise.P04_Foggy;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<String> result = new ArrayList<>();

        while (!input.equals("END")) {
            int[] ints = Arrays.stream(input.split(", ")).mapToInt(Integer::parseInt).toArray();
            Lake lake = new Lake(ints);

            while (lake.iterator().hasNext()) {
                result.add(String.valueOf(lake.iterator().next()));
            }

            System.out.println(String.join(", ", result));

            input = sc.nextLine();
        }






    }
}
