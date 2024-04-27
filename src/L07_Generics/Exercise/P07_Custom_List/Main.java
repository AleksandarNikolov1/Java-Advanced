package L07_Generics.Exercise.P07_Custom_List;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        CustomList<String> customList = new CustomList<>();

        while (!input.equals("END")){
            String[] tokens = input.split("\\s+");
            String command = tokens[0];

            switch (command){
                case "Add":
                    String elementToAdd = tokens[1];
                    customList.add(elementToAdd);
                    break;
                case "Remove":
                    int index = Integer.parseInt(tokens[1]);
                    customList.remove(index);
                    break;
                case "Contains":
                    String element = tokens[1];
                    System.out.println(customList.contains(element));
                    break;
                case "Swap":
                    int firstIndex = Integer.parseInt(tokens[1]);
                    int secondIndex = Integer.parseInt(tokens[2]);
                    customList.swap(firstIndex, secondIndex);
                    break;
                case "Greater":
                    String elementToCompare = tokens[1];
                    System.out.println(customList.countGreaterThan(elementToCompare));
                    break;
                case "Max":
                    System.out.println(customList.getMax());
                    break;
                case "Min":
                    System.out.println(customList.getMin());
                    break;
                case "Print":
                    customList.print();
                    break;

            }

            input = sc.nextLine();
        }
    }
}
