package L03_Sets_and_Maps_Advanced.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class P06_ProductShop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<String, Map<String, Double>> map = new TreeMap<>();

        while (!input.equals("Revision")){
            String[] tokens = input.split(", ");
            String shop = tokens[0];
            String product = tokens[1];
            double price = Double.parseDouble(tokens[2]);

            map.putIfAbsent(shop, new LinkedHashMap<>());
            map.get(shop).put(product, price);

            input = sc.nextLine();
        }

        map.forEach((shop, products) -> {
            System.out.printf("%s->%n", shop);
            products.forEach((product, price) -> {
                System.out.printf("Product: %s, Price: %.1f%n", product, price);
            });
        });
    }
}
