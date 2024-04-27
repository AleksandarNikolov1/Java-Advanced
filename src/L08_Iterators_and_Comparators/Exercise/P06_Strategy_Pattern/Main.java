package L08_Iterators_and_Comparators.Exercise.P06_Strategy_Pattern;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Set<Person> sortedPersonByName = new TreeSet<>(new PersonNameComparator());
        Set<Person> sortedPersonByAge = new TreeSet<>(new PersonAgeComparator());

        while (n-- > 0){
            String[] tokens = sc.nextLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);
            sortedPersonByName.add(person);
            sortedPersonByAge.add(person);
        }

        for (Person person : sortedPersonByName) {
            System.out.println(person.getName() + " " + person.getAge());
        }

        for (Person person : sortedPersonByAge) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }
}
