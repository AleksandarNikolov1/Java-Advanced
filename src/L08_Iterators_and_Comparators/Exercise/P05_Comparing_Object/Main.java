package L08_Iterators_and_Comparators.Exercise.P05_Comparing_Object;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Person> people = new ArrayList<>();

        while (!input.equals("END")){
            String[] tokens = input.split("\\s+");
            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);
            String town = tokens[2];

            Person person = new Person(name, age, town);
            people.add(person);
            
            input = sc.nextLine();
        }

        int n = Integer.parseInt(sc.nextLine());

        Person personToCompare = people.get(n - 1);


        int equalPeople = 0;
        int notEqualPeople = 0;

        for (Person person : people) {
            if (personToCompare.compareTo(person) == 0)
                equalPeople ++;

            else
                notEqualPeople ++;
        }

        if (equalPeople > 1)
            System.out.printf("%d %d %d", equalPeople, notEqualPeople, people.size());

        else
            System.out.println("No matches");

    }
}
