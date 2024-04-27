package L06_Defining_Classes.Exercise.P08_Family_Tree;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String searchedPersonCriteria = sc.nextLine();

        String input = sc.nextLine();

        List<Person> familyMembers = new ArrayList<>();
        Map<Child, List<Parent>> childParents = new LinkedHashMap<>();
        Map<Parent, List<Child>> parenChildren = new LinkedHashMap<>();

        List<String> inputs = new ArrayList<>();

        while (!input.equals("End")) {

            if (input.contains("-")) {
                inputs.add(input);
            } else {
                String[] tokens = input.split("\\s+");
                String firstName = tokens[0];
                String lastName = tokens[1];
                String birthdayDate = tokens[2];

                Person person = new Person(firstName, lastName, birthdayDate);
                familyMembers.add(person);
            }

            input = sc.nextLine();
        }

        for (String str : inputs) {
            String[] tokens = str.split(" - ");

            Parent parent = null;
            Child child = null;


            if (!tokens[0].contains("/") && !tokens[1].contains("/")) {
                String parentFirstName = tokens[0].split(" ")[0];
                String parentLastName = tokens[0].split(" ")[1];
                String childFirstName = tokens[1].split(" ")[0];
                String childLastName = tokens[1].split(" ")[1];

                String parentBirthdayDate = Parent.getBirthdayDate(parentFirstName + " " + parentLastName, familyMembers);

                parent = new Parent(parentFirstName, parentLastName, parentBirthdayDate);

                String childBirthdayDate = Child.getBirthdayDate(childFirstName + " " + childLastName, familyMembers);

                child = new Child(childFirstName, childLastName, childBirthdayDate);
            } else if (tokens[0].contains("/") && tokens[1].contains("/")) {
                String parentBirthdayDate = tokens[0];
                String childBirthdayDate = tokens[1];

                String parentFirstName = Parent.getFirstName(parentBirthdayDate, familyMembers);
                String parentLastName = Parent.getLastName(parentBirthdayDate, familyMembers);

                parent = new Parent(parentFirstName, parentLastName, parentBirthdayDate);

                String childFirstName = Child.getFirstName(childBirthdayDate, familyMembers);
                String childLastName = Child.getLastName(childBirthdayDate, familyMembers);

                child = new Child(childFirstName, childLastName, childBirthdayDate);
            } else if (tokens[0].contains("/") && !tokens[1].contains("/")) {
                String parentBirthdayDate = tokens[0];
                String childFirstName = tokens[1].split(" ")[0];
                String childLastName = tokens[1].split(" ")[1];

                String parentFirstName = Parent.getFirstName(parentBirthdayDate, familyMembers);
                String parentLastName = Parent.getLastName(parentBirthdayDate, familyMembers);

                parent = new Parent(parentFirstName, parentLastName, parentBirthdayDate);

                String childBirthdayDate = Child.getBirthdayDate(childFirstName + " " + childLastName, familyMembers);

                child = new Child(childFirstName, childLastName, childBirthdayDate);
            } else if (!tokens[0].contains("/") && tokens[1].contains("/")) {
                String parentFirstName = tokens[0].split(" ")[0];
                String parentLastName = tokens[0].split(" ")[1];
                String childBirthdayDate = tokens[1];

                String parentBirthdayDate = Parent.getBirthdayDate(parentFirstName + " " + parentLastName, familyMembers);

                parent = new Parent(parentFirstName, parentLastName, parentBirthdayDate);

                String childFirstName = Child.getFirstName(childBirthdayDate, familyMembers);
                String childLastName = Child.getLastName(childBirthdayDate, familyMembers);

                child = new Child(childFirstName, childLastName, childBirthdayDate);
            }

            if (child != null)
                parent.addChild(child);

            if (parent != null)
                child.addParent(parent);

            childParents.putIfAbsent(child, new ArrayList<>());
            childParents.get(child).add(parent);

            parenChildren.putIfAbsent(parent, new ArrayList<>());
            parenChildren.get(parent).add(child);

        }

        Person person = null;

        if (!searchedPersonCriteria.contains("/")) {
            String name = searchedPersonCriteria;
            person = familyMembers.stream().filter(p -> p.getFullName().equals(name)).
                    findFirst().orElse(null);
        } else {
            String birthdayDate = searchedPersonCriteria;
            person = familyMembers.stream().filter(p -> p.getBirthdayDate().equals(birthdayDate))
                    .findFirst().orElse(null);
        }

        if (person != null) {
            System.out.printf("%s %s%n", person.getFullName(), person.getBirthdayDate());
            System.out.printf("Parents:%n");
            for (var entry : childParents.entrySet()) {
                if (entry.getKey().getFullName().equals(person.getFullName())) {
                    for (Parent p : entry.getValue()) {
                        System.out.printf("%s %s%n", p.getFullName(), p.getBirthdayDate());
                    }
                }
            }
            System.out.printf("Children:%n");
            for (var entry : parenChildren.entrySet()) {
                if (entry.getKey().getFullName().equals(person.getFullName())) {
                    for (Child c : entry.getValue()) {
                        System.out.printf("%s %s%n", c.getFullName(), c.getBirthdayDate());
                    }
                }
            }
        }
    }
}



