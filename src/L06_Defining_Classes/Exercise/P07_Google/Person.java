package L06_Defining_Classes.Exercise.P07_Google;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private Company company;
    private Car car;
    private List<Parent> parents;
    private List<Child> children;
    private List<Pokemon> pokemons;

    public Person(String name) {
        this.name = name;
        this.parents = new ArrayList<>();
        this.children = new ArrayList<>();
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Car getCar() {
        return car;
    }

    public Company getCompany() {
        return company;
    }

    public List<Child> getChildren() {
        return children;
    }

    public List<Parent> getParents() {
        return parents;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    public void addParent(Parent parent){
        parents.add(parent);
    }

    public void addChild(Child child){
        children.add(child);
    }

    public void addPokemon(Pokemon pokemon){
        pokemons.add(pokemon);
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    @Override
    public String toString() {
        return name;
    }

    public static class Company {
        private String name;
        private String department;
        private double salary;

        public Company(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        @Override
        public String toString() {
            return String.format("Company:%n%s %s %.2f", name, department, salary);
        }
    }

    public static class Pokemon {
        private String name;
        private String type;

        public Pokemon(String name, String type) {
            this.name = name;
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("%s %s", name, type);
        }

    }

    public static class Parent {
        private String name;
        private String birthday;

        public Parent(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return String.format("%s %s", name, birthday);
        }

    }

    public static class Child {
        private String name;
        private String birthday;

        public Child(String name, String birthday) {
            this.name = name;
            this.birthday = birthday;
        }

        @Override
        public String toString() {
            return String.format("%s %s", name, birthday);
        }
    }

    public static class Car {
        private String model;
        private int speed;

        public Car(String model, int speed) {
            this.model = model;
            this.speed = speed;
        }

        @Override
        public String toString() {
            return String.format("Car:%n%s %d", model, speed);
        }
    }
}
