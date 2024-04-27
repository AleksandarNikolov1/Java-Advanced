package L08_Iterators_and_Comparators.Exercise.P07_Equality_Logic;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        Set<Person> treeSetOfPeople = new TreeSet<>();
        Set<Person> hashSetOfPeople = new HashSet<>();

        while (n-- > 0){
            String[] tokens = sc.nextLine().split("\\s+");

            String name = tokens[0];
            int age = Integer.parseInt(tokens[1]);

            Person person = new Person(name, age);

            treeSetOfPeople.add(person);
            hashSetOfPeople.add(person);
        }

        System.out.println(treeSetOfPeople.size());
        System.out.println(hashSetOfPeople.size());
    }
}
