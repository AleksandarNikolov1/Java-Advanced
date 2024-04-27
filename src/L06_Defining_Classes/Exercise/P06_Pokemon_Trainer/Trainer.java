package L06_Defining_Classes.Exercise.P06_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;

public class Trainer {
    private String name;
    private int badges;
    private List<Pokemon> pokemons;

    public Trainer(String name) {
        this.name = name;
        this.badges = 0;
        this.pokemons = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBadges() {
        return badges;
    }

    public void setBadges(int badges) {
        this.badges = badges;
    }

    public List<Pokemon> getPokemons() {
        return pokemons;
    }

    public void addPokemon(Pokemon pokemon){
        this.pokemons.add(pokemon);
    }

    public void increaseBadgesBy1(){
        badges++;
    }

    public boolean containsPokemonWithElement(String element){
        for (Pokemon pokemon : pokemons) {
            if (pokemon.getElement().equals(element))
                return true;
        }

        return false;
    }

    public void decreasePokemonsHealthBy10(){
        for (Pokemon pokemon : pokemons) {
            pokemon.decreasePokemonHealthBy10();
        }
    }


}
