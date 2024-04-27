package L03_Sets_and_Maps_Advanced.Lab;

import java.util.*;

public class P03_WarNumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<Integer> firstDeck = new LinkedHashSet<>();
        Set<Integer> secondDeck = new LinkedHashSet<>();

        int[] arr1 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr2 = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for (int card : arr1) {
            firstDeck.add(card);
        }

        for (int card : arr2) {
            secondDeck.add(card);
        }

        int roundsCounter = 0;

        while (roundsCounter < 50  && !firstDeck.isEmpty() && !secondDeck.isEmpty()){

            int firsPlayerCard = firstDeck.iterator().next();
            int secondPlayerCard = secondDeck.iterator().next();

            firstDeck.remove(firsPlayerCard);
            secondDeck.remove(secondPlayerCard);

            if (firsPlayerCard > secondPlayerCard) {
                firstDeck.add(firsPlayerCard);
                firstDeck.add(secondPlayerCard);
            }

            else if (firsPlayerCard < secondPlayerCard){
                secondDeck.add(firsPlayerCard);
                secondDeck.add(secondPlayerCard);
            }

            else {
                firstDeck.add(firsPlayerCard);
                secondDeck.add(secondPlayerCard);
            }

            roundsCounter++;
        }

        if (firstDeck.size() > secondDeck.size())
            System.out.println("First player win!");


        else if (firstDeck.size() < secondDeck.size())
            System.out.println("Second player win!");


        else
            System.out.println("Draw!");

    }
}
