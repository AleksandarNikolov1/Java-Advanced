package L09_Exam_Preparation;

import java.util.*;
import java.util.stream.Collectors;

public class Cooking_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> liquidsQueue = Arrays.stream(sc.nextLine().split("\\s+")).map(Integer::parseInt)
                .collect(Collectors.toCollection(ArrayDeque::new));

        ArrayDeque<Integer> ingredients = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split("\\s+"))
                .map(Integer::parseInt)
                .forEach(ingredients::push);

        Map<String, Integer> foodValues = new HashMap<>();
        foodValues.put("Bread", 25);
        foodValues.put("Cake", 50);
        foodValues.put("Pastry", 75);
        foodValues.put("Fruit Pie", 100);

        Map<String, Integer> cookedFood = new TreeMap<>();
        cookedFood.put("Bread", 0);
        cookedFood.put("Cake", 0);
        cookedFood.put("Pastry", 0);
        cookedFood.put("Fruit Pie", 0);



        while (!liquidsQueue.isEmpty() && !ingredients.isEmpty()){
            int result = liquidsQueue.poll() + ingredients.peek();

            boolean isCooked = false;

            for (var entry : foodValues.entrySet()) {
                if (result == entry.getValue()) {
                    cookedFood.put(entry.getKey(), cookedFood.get(entry.getKey()) + 1);
                    ingredients.pop();
                    isCooked = true;
                    break;
                }
            }

            if (!isCooked) {
                ingredients.push(ingredients.pop() + 3);
            }
        }

        String leftLiquids = "none";
        String leftIngredients = "none";


        if (!liquidsQueue.isEmpty()) {

            leftLiquids = liquidsQueue.stream().map(Objects::toString).collect(Collectors.joining(", "));
        }

        if (!ingredients.isEmpty()) {
            leftIngredients = ingredients.stream().map(Objects::toString).collect(Collectors.joining(", "));
        }

        if (liquidsQueue.isEmpty() && ingredients.isEmpty()) {
            System.out.println("Wohoo! You succeeded in cooking all the food!");
            System.out.printf("Liquids left: %s%nIngredients left: %s%n", leftLiquids, leftIngredients);

            for (var entry : cookedFood.entrySet()) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }

        else {
            System.out.println("Ugh, what a pity! You didn't have enough materials to cook everything.");
            System.out.printf("Liquids left: %s%nIngredients left: %s%n", leftLiquids, leftIngredients);

            for (var entry : cookedFood.entrySet()) {
                System.out.printf("%s: %d%n", entry.getKey(), entry.getValue());
            }
        }
    }
}
