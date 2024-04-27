package L05_Functional_Programming.Lab;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_FilterByAge {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Map<String, Integer> people = new LinkedHashMap<>();

        while (n-- > 0) {
            String input = sc.nextLine();
            String name = input.split(", ")[0];
            int age = Integer.parseInt(input.split(", ")[1]);
            people.put(name, age);
        }

        String condition = sc.nextLine();
        int age = Integer.parseInt(sc.nextLine());
        String format = sc.nextLine();

        if (condition.equals("younger")){
            people = getYoungerPeople(age, people);
        }

        else if (condition.equals("older")){
            people = getOlderPeople(age, people);
        }

        printPeople(format, people);

    }


    private static Map<String, Integer> getYoungerPeople(int age, Map<String, Integer> map) {

        Map<String, Integer> people = new LinkedHashMap<>();

            map.entrySet().stream().filter(p -> p.getValue() < age)
                    .forEach(p -> people.put(p.getKey(), p.getValue()));

        return people;
    }

    private static Map<String, Integer> getOlderPeople (int age, Map<String, Integer> map){

        Map<String, Integer> people = new LinkedHashMap<>();

        map.entrySet().stream().filter(p -> p.getValue() > age)
                .forEach(p -> people.put(p.getKey(), p.getValue()));

        return people;
    }

    private static void printPeople (String format, Map<String, Integer> people){

        if (format.contains("name") && format.contains("age")){
            for (var entry : people.entrySet()) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }

        else if (format.equals("name")){
            for (String name : people.keySet()) {
                System.out.println(name);
            }
        }

        else
            for (Integer age : people.values()) {
                System.out.println(age);
            }
    }
}


//· Condition - "younger" or "older"
//· Age - Integer
//· Format - "name", "age" or "name age"

//5
//        Pesho, 20
//        Gosho, 18
//        Mimi, 29
//        Ico, 31
//        Simo, 16
//        older
//        20
//        name age