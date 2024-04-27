package L05_Functional_Programming.Exercise;

import java.util.*;
import java.util.stream.Collectors;

public class P11_ThePartyReservationFilterModule {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<String> names = Arrays.stream(sc.nextLine().split("\\s+"))
                .collect(Collectors.toList());

        List<String> removedNames = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("Print")) {
            String[] tokens = input.split(";");
            String command = tokens[0];
            String filterType = tokens[1];

            if (command.equals("Add filter")) {
                switch (filterType) {
                    case "Starts with":
                        removedNames.addAll(names.stream().filter(name -> name.startsWith(tokens[2]))
                                .collect(Collectors.toList()));

                        names.removeAll(removedNames);
                        break;
                    case "Ends with":
                        removedNames.addAll(names.stream().filter(name -> name.endsWith(tokens[2]))
                                .collect(Collectors.toList()));

                        names.removeAll(removedNames);

                        break;
                    case "Length":
                        removedNames.addAll(names.stream().filter(name -> name.length() == Integer.parseInt(tokens[2]))
                                .collect(Collectors.toList()));

                        names.removeAll(removedNames);
                        break;
                    case "Contains":
                        removedNames.addAll(names.stream().filter(name -> name.contains(tokens[2]))
                                .collect(Collectors.toList()));

                        names.removeAll(removedNames);
                        break;
                }
            } else if (command.equals("Remove filter")) {
                switch (filterType) {
                    case "Starts with":
                        names.addAll(removedNames.stream().filter(name -> name.startsWith(tokens[2]))
                                .collect(Collectors.toList()));
                        removedNames.removeAll(names);
                        break;
                    case "Ends with":
                        names.addAll(removedNames.stream().filter(name -> name.endsWith(tokens[2]))
                                .collect(Collectors.toList()));
                        removedNames.removeAll(names);
                        break;
                    case "Length":
                        names.addAll(removedNames.stream().filter(name -> name.length() == Integer.parseInt(tokens[2]))
                                .collect(Collectors.toList()));
                        removedNames.removeAll(names);
                        break;
                    case "Contains":
                        names.addAll(removedNames.stream().filter(name -> name.contains(tokens[2]))
                                .collect(Collectors.toList()));
                        removedNames.removeAll(names);
                        break;
                }
            }

            input = sc.nextLine();
        }

        System.out.println(String.join(" ", names));
    }
}

