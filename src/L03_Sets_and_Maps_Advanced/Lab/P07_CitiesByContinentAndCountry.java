package L03_Sets_and_Maps_Advanced.Lab;

import java.util.*;

public class P07_CitiesByContinentAndCountry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Map<String, List<String>>> worldMap = new LinkedHashMap<>();

        while (n-- > 0){
            String[] tokens = sc.nextLine().split(" ");
            String continent = tokens[0];
            String country = tokens[1];
            String city = tokens[2];

            worldMap.putIfAbsent(continent, new LinkedHashMap<>());
            worldMap.get(continent).putIfAbsent(country, new ArrayList<>());
            worldMap.get(continent).get(country).add(city);
        }

        worldMap.forEach((continent, countries) -> {
            System.out.printf("%s:%n", continent);

            countries.forEach((country, cities) -> {
                String joinedCities = String.join(", ", cities);

                System.out.printf("%s -> %s%n", country, joinedCities);
            });
        });
    }
}
