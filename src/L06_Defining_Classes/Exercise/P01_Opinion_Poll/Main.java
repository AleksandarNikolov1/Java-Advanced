package L06_Defining_Classes.Exercise.P01_Opinion_Poll;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Person> people = new ArrayList<>();

        while (n-- > 0){
            String personData = sc.nextLine();
            String name = personData.split("\\s+")[0];
            int age = Integer.parseInt(personData.split("\\s+")[1]);

            Person person = new Person(name, age);

            people.add(person);
        }

        people.stream().filter(p -> p.getAge() > 30).sorted((p1, p2) -> p1.getName().compareTo(p2.getName()))
                .forEach(p -> System.out.printf("%s - %d%n", p.getName(), p.getAge()));
    }
}
