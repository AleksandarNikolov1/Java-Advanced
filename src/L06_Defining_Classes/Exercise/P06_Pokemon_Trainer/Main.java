package L06_Defining_Classes.Exercise.P06_Pokemon_Trainer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        List<Trainer> trainers = new ArrayList<>();

        while (!input.equals("Tournament")) {
            String[] tokens = input.split("\\s+");
            String trainerName = tokens[0];
            String pokemonName = tokens[1];
            String element = tokens[2];
            int health = Integer.parseInt(tokens[3]);

            Trainer trainer = trainers.stream().filter(t -> t.getName().equals(trainerName))
                    .findFirst().orElseGet(() -> {
                        Trainer newTrainer =  new Trainer(trainerName);
                        trainers.add(newTrainer);
                        return newTrainer;
                    });


            Pokemon pokemon = new Pokemon(pokemonName, element, health);

            trainer.getPokemons().add(pokemon);

            input = sc.nextLine();
        }

        String element = sc.nextLine();

        while (!element.equals("End")) {

            List<Pokemon> deadPokemons = new ArrayList<>();


            for (Trainer trainer : trainers) {

                if (trainer.containsPokemonWithElement(element)) {
                    trainer.increaseBadgesBy1();
                }

                else {
                    trainer.decreasePokemonsHealthBy10();

                    for (Pokemon pokemon : trainer.getPokemons()) {
                        if (pokemon.isDead())
                            deadPokemons.add(pokemon);
                    }
                }

                trainer.getPokemons().removeAll(deadPokemons);
            }

            element = sc.nextLine();
        }



        trainers.stream().sorted((t1, t2) -> Integer.compare(t2.getBadges(), t1.getBadges()))
                .forEach(t -> System.out.printf("%s %d %d%n", t.getName(), t.getBadges(), t.getPokemons().size()));


    }
}
