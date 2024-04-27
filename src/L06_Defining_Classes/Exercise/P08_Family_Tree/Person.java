package L06_Defining_Classes.Exercise.P08_Family_Tree;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String firstName;
    private String lastName;
    private String birthdayDate;
    private List<Parent> parents;
    private List<Child> children;


    public Person(String firstName, String lastName, String birthdayDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayDate = birthdayDate;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public void addChild(Child child) {
        children.add(child);
    }

    public void addParent(Parent parent) {
        parents.add(parent);
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getBirthdayDate() {
        return birthdayDate;
    }

    public static String getBirthdayDate(String name, List<Person> familyMembers) {
        return familyMembers.stream().filter(p -> p.getFullName().equals(name))
                .findFirst().map(Person::getBirthdayDate).orElse(null);
    }

    public static String getFirstName(String birthdayDate, List<Person> familyMembers) {
        return familyMembers.stream().filter(p -> p.getBirthdayDate().equals(birthdayDate))
                .findFirst().map(Person::getFirstName).orElse(null);
    }

    public static String getLastName(String birthdayDate, List<Person> familyMembers) {
        return familyMembers.stream().filter(p -> p.getBirthdayDate().equals(birthdayDate))
                .findFirst().map(Person::getLastName).orElse(null);
    }
}
