package L10_Exams.Regular_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class P01_MagicBox {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<Integer> firstBox = Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> secondBox = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+")).mapToInt(Integer::parseInt)
                .forEach(secondBox::push);

        List<Integer> claimedItems = new ArrayList<>();

        while (!firstBox.isEmpty() && !secondBox.isEmpty()) {
            int firstItem = firstBox.poll();
            int secondItem = secondBox.pop();
            int sum = firstItem + secondItem;

            if (sum % 2 == 0)
                claimedItems.add(sum);

            else {
                firstBox.offerFirst(firstItem);
                firstBox.offer(secondItem);
            }
        }

        if (firstBox.isEmpty()) {
            System.out.println("First magic box is empty.");
        }

        if (secondBox.isEmpty()) {
            System.out.println("Second magic box is empty.");
        }

        int claimedItemsSum = claimedItems.stream().mapToInt(Integer::valueOf).sum();

        if (claimedItemsSum >= 90)
            System.out.println("Wow, your prey was epic! Value: " + claimedItemsSum);

        else
            System.out.println("Poor prey... Value: " + claimedItemsSum);

    }
}
