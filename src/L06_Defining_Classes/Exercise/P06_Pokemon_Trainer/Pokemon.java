package L06_Defining_Classes.Exercise.P06_Pokemon_Trainer;

public class Pokemon {
    private String name;
    private String element;
    private int health;

    public Pokemon(String name, String element, int health) {
        this.name = name;
        this.element = element;
        this.health = health;
    }

    public String getName() {
        return name;
    }

    public String getElement() {
        return element;
    }

    public void decreasePokemonHealthBy10(){
        health -= 10;
    }

    public boolean isDead(){
        return health <= 0;
    }
}
