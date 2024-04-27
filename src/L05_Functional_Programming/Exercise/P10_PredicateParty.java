package L05_Functional_Programming.Exercise;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class P10_PredicateParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        String input = sc.nextLine();

        while (!input.equals("Party!")) {
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command) {
                case "Double":
                    if (tokens[1].equals("StartsWith")) {
                        String name = getNameStartsWith(names, tokens[2]);

                        if (name != null) {
                            long count = names.stream().filter(str -> str.startsWith(tokens[2])).count();
                            for (int i = 0; i < count; i++) {
                                names.add(name);
                            }
                        }
                    }

                    else if (tokens[1].equals("EndsWith")) {
                        String name = getNameEndsWith(names, tokens[2]);

                        if (name != null) {
                            long count = names.stream().filter(str -> str.endsWith(tokens[2])).count();
                            for (int i = 0; i < count; i++) {
                                names.add(name);
                            }
                        }
                    }

                    else if (tokens[1].equals("Length")) {
                        String name = getNameByLength(names, Integer.parseInt(tokens[2]));

                        if (name != null) {
                            long count = names.stream().filter(str -> str.length() == Integer.parseInt(tokens[2])).count();
                            for (int i = 0; i < count; i++) {
                                names.add(name);
                            }
                        }
                    }
                    break;
                case "Remove":
                    if (tokens[1].equals("StartsWith")) {
                            String name = getNameStartsWith(names, tokens[2]);

                            if (name != null)
                                names.removeIf(str -> str.equals(name));
                        }
                        else  if (tokens[1].equals("EndsWith")){
                            String name = getNameEndsWith(names, tokens[2]);

                            if (name != null)
                                names.removeIf(str -> str.equals(name));
                        }
                        else if (tokens[1].equals("Length")) {
                            String name = getNameByLength(names, Integer.parseInt(tokens[2]));

                            if (name != null)
                                names.removeIf(str -> str.equals(name));
                    }
                    break;
            }

            input = sc.nextLine();
        }

        String result;

        if (!names.isEmpty()) {
            Collections.sort(names);
            result = String.join(", ", names) + " are going to the party!";
        } else {
            result = "Nobody is going to the party!";
        }

        System.out.println(result);
    }

    private static String getNameStartsWith(List<String> names, String str) {
        return names.stream().filter(name -> name.startsWith(str))
                .findFirst().orElse(null);
    }

    private static String getNameEndsWith(List<String> names, String str) {
        return names.stream().filter(name -> name.endsWith(str))
                .findFirst().orElse(null);
    }

    private static String getNameByLength(List<String> names, int length) {
        return names.stream().filter(name -> name.length() == length)
                .findFirst().orElse(null);
    }
}
