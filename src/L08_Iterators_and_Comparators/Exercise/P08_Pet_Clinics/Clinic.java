package L08_Iterators_and_Comparators.Exercise.P08_Pet_Clinics;

import java.util.Iterator;

public class Clinic implements Iterable<Pet> {
    private String name;
    private int rooms;
    private Pet[] pets;

    public Clinic(String name, int rooms) {
        this.name = name;
        this.rooms = rooms;
        this.pets = new Pet[rooms];
    }

    public String getName() {
        return name;
    }

    public Pet[] getPets() {
        return pets;
    }

    public boolean addPet(Pet pet) {
        int index = (pets.length - 1) / 2;

        if (pets[index] == null) {
            pets[index] = pet;
            return true;
        }

        else {
            for (int i = index - 1; i >= 0; i--) {
                if (pets[i] == null) {
                    pets[i] = pet;
                    return true;
                } else if (pets[i] != null) {
                    pets[pets.length - 1 - i] = pet;
                    return true;
                }
            }
        }

        return false;
    }

    public static boolean releasePet(Clinic clinic) {
        Pet[] pets = clinic.getPets();

        int index = (pets.length - 1) / 2;

        if (pets[index] != null) {
            pets[index] = null;
            return true;
        }

        else{
            for (int i = index + 1; i < pets.length; i++) {
                if (pets[i] != null){
                    pets[i] = null;
                    return true;
                }

                for (int j = 0; j < pets.length / 2; j++) {
                    if (pets[i] != null) {
                        pets[i] = null;
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public static boolean hasEmptyRoom(Clinic clinic){
        Pet[] pets = clinic.getPets();

        for (Pet pet : pets) {
            if (pet == null)
                return true;
        }

        return false;
    }

    private class PetIterator implements Iterator<Pet>{

        private int index = 0;
        @Override
        public boolean hasNext() {
            return index < pets.length;
        }

        @Override
        public Pet next() {
            return pets[index++];
        }
    }

    @Override
    public Iterator<Pet> iterator() {
        return new PetIterator();
    }
}
