package L10_Exams.Retake_Exam;

import java.util.*;
import java.util.stream.Collectors;

public class P01_Bouquets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<Integer> tulips = new ArrayDeque<>();
        Arrays.stream(sc.nextLine().split(", ")).mapToInt(Integer::parseInt)
                .forEach(tulips::push);

        ArrayDeque<Integer> daffodils = Arrays.stream(sc.nextLine().split(", "))
                .map(Integer::parseInt).collect(Collectors.toCollection(ArrayDeque::new));

        List<Integer> storedFlowers = new ArrayList<>();

        int bouquets = 0;

        while (!tulips.isEmpty() && !daffodils.isEmpty()){
            int tulip = tulips.pop();
            int daffodil = daffodils.poll();

            int result = tulip + daffodil;

            if (result == 15)
                bouquets++;

            else if (result > 15) {

                while (result > 15){
                    result -= 2;

                    if (result == 15){
                        bouquets++;
                    }

                    else if (result < 15){
                        storedFlowers.add(result);
                    }
                }
            }

            else {
                storedFlowers.add(result);
            }
        }

        int additionalBouquets = 0;

        int storedFlowersSum = storedFlowers.stream().mapToInt(Integer::valueOf).sum();
        if (storedFlowersSum >= 15){
            additionalBouquets = storedFlowers.stream().mapToInt(Integer::valueOf).sum() / 15;
        }

        bouquets += additionalBouquets;

        if (bouquets >= 5){
            System.out.printf("You made it! You go to the competition with %d bouquets!", bouquets);
        }

        else
            System.out.printf("You failed... You need more %d bouquets.", 5 - bouquets);
    }
}
