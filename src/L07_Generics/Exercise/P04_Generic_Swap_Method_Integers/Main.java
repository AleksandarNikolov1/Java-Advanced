package L07_Generics.Exercise.P04_Generic_Swap_Method_Integers;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Box<Integer> box = new Box<>();

        while (n-- > 0){
            int num = Integer.parseInt(sc.nextLine());
            box.addElement(num);
        }

        int[] indexes = Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        int firstIndex = indexes[0];
        int secondIndex = indexes[1];


        box.swapElements(firstIndex, secondIndex);

        System.out.println(box.toString());
    }
}
