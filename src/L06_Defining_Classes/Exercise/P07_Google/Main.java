package L06_Defining_Classes.Exercise.P07_Google;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        Set<Person> people = new LinkedHashSet<>();


        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");
            String name = tokens[0];

            Person person = people.stream().filter(p -> p.getName().equals(name)).findFirst()
                    .orElseGet(() -> new Person(name));

            switch (tokens[1]) {
                case "company":
                    String companyName = tokens[2];
                    String department = tokens[3];
                    double salary = Double.parseDouble(tokens[4]);
                    Person.Company company = new Person.Company(companyName, department, salary);
                    person.setCompany(company);
                    break;
                case "pokemon":
                    String pokemonName = tokens[2];
                    String pokemonType = tokens[3];
                    Person.Pokemon pokemon = new Person.Pokemon(pokemonName, pokemonType);
                    person.addPokemon(pokemon);
                    break;
                case "parents":
                    String parentName = tokens[2];
                    String parentBirthday = tokens[3];
                    Person.Parent parent = new Person.Parent(parentName, parentBirthday);
                    person.addParent(parent);
                    break;
                case "children":
                    String childName = tokens[2];
                    String childBirthday = tokens[3];
                    Person.Child child = new Person.Child(childName, childBirthday);
                    person.addChild(child);
                    break;
                case "car":
                    String model = tokens[2];
                    int carSpeed = Integer.parseInt(tokens[3]);
                    Person.Car car = new Person.Car(model, carSpeed);
                    person.setCar(car);
                    break;
            }

            people.add(person);


            input = sc.nextLine();
        }

        String searchedPerson = sc.nextLine();


        for (Person person : people) {
            if (person.getName().equals(searchedPerson)) {
                System.out.println(person.toString());

                Person.Company company = person.getCompany();
                if (company != null) {
                    System.out.printf("%s%n", company.toString());
                } else {
                    System.out.println("Company: ");
                }

                Person.Car car = person.getCar();
                if (car != null) {
                    System.out.println(car.toString());
                } else {
                    System.out.println("Car: ");
                }

                System.out.printf("Pokemon:%n");
                for (Person.Pokemon pokemon : person.getPokemons()) {
                    System.out.println(pokemon.toString());
                }

                System.out.printf("Parents:%n");
                for (Person.Parent parent : person.getParents()) {
                    System.out.println(parent.toString());
                }

                System.out.printf("Children:%n");
                for (Person.Child child : person.getChildren()) {
                    System.out.println(child.toString());
                }
            }
        }

    }}
