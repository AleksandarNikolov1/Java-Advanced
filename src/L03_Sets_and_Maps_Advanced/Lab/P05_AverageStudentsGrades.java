package L03_Sets_and_Maps_Advanced.Lab;

import java.util.*;

public class P05_AverageStudentsGrades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Double>> gradesMap = new TreeMap<>();

        while (n-- > 0){
            String input = sc.nextLine();
            String name = input.split(" ")[0];
            double grade = Double.parseDouble(input.split(" ")[1]);

            gradesMap.putIfAbsent(name, new ArrayList<>());
            gradesMap.get(name).add(grade);
        }

        gradesMap.forEach((key, value) -> {
            double sum = 0;

            for (Double d : value) {
                sum += d;
            }

            double avg = sum / value.size();

            System.out.printf("%s -> ", key);

            for (Double grade : value) {
                System.out.printf("%.2f ", grade);
            }

            System.out.printf("(avg: %.2f)%n", avg);
        });
    }
}
