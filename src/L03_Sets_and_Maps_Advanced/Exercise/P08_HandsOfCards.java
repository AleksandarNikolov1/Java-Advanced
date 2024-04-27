package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.*;

public class P08_HandsOfCards {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Set<String>> playerDeck = new LinkedHashMap<>();

        while (!input.equals("JOKER")) {

            String name = input.split(": ")[0];
            String[] cards = input.split(": ")[1].split(", ");

            playerDeck.putIfAbsent(name, new LinkedHashSet<>());
            playerDeck.get(name).addAll(List.of(cards));

            input = sc.nextLine();
        }

        for (var entry : playerDeck.entrySet()) {

            int sum = 0;

            for (String card : entry.getValue()) {
                sum += getPower(card);
            }

            System.out.printf("%s: %d%n", entry.getKey(), sum);
        }
    }

    private static int getPower(String card) {
        int power = 0;
        int multiplier = 0;

        char firstChar = card.charAt(0);

        char secondChar = '0';

        if (card.length() == 2)
            secondChar = card.charAt(1);

        else
            secondChar = card.charAt(2);

        if (card.length() == 3)
            power = 10;

        else if (Character.isDigit(firstChar))
            power = Integer.parseInt(firstChar + "");

        else if (firstChar == 'J')
            power = 11;

        else if (firstChar == 'Q')
            power = 12;

        else if (firstChar == 'K')
            power = 13;

        else if (firstChar == 'A')
            power = 14;

        if (secondChar == 'S')
            multiplier = 4;

        else if (secondChar == 'H')
            multiplier = 3;

        else if (secondChar == 'D')
            multiplier = 2;

        else if (secondChar == 'C')
            multiplier = 1;

        return power * multiplier;
    }
}
