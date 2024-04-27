package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P06_AMinerTask {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, Integer> resources = new LinkedHashMap<>();

        while (true){
            String resource = sc.nextLine();

            if (resource.equals("stop"))
                break;

            int quantity = Integer.parseInt(sc.nextLine());

            resources.put(resource, quantity);
        }

        resources.forEach((r, q) -> System.out.printf("%s -> %d%n", r, q));
    }
}
