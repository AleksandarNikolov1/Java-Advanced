package L03_Sets_and_Maps_Advanced.Lab;

import java.util.*;
import java.util.stream.Collectors;

public class P08_AcademyGraduation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, List<Double>> graduations = new TreeMap<>();

        while (n-- > 0){
            String name = sc.nextLine();
            List<Double> grades = Arrays.stream(sc.nextLine().split("\\s+"))
                    .map(Double::parseDouble).collect(Collectors.toList());

            graduations.put(name, grades);
        }

        for (var entry : graduations.entrySet()) {

            //double averageGrade = entry.getValue().stream().mapToDouble(Double::doubleValue).average().orElse(0.0);

            double sum = 0;
            for (Double grade : entry.getValue()) {
                sum += grade;
            }

            double averageGrade = sum / entry.getValue().size();

            System.out.printf("%s is graduated with %s%n", entry.getKey(), averageGrade);
        }
    }
}
