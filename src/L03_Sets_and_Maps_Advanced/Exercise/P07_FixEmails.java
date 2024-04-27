package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P07_FixEmails {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Map<String, String> emails = new LinkedHashMap<>();

        while (true) {
            String name = sc.nextLine();

            if (name.equals("stop"))
                break;

            String email = sc.nextLine();

            emails.put(name, email);
        }

        emails.entrySet().stream().filter(n -> !n.getValue().contains(".us")
                && !n.getValue().contains(".uk") && !n.getValue().contains(".com"))
                .forEach((n) -> System.out.printf("%s -> %s%n", n.getKey(), n.getValue()));
    }
}
