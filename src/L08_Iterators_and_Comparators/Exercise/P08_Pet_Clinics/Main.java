package L08_Iterators_and_Comparators.Exercise.P08_Pet_Clinics;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Pet> pets = new ArrayList<>();
        List<Clinic> clinics = new ArrayList<>();

        while (n-- > 0){
            String[] tokens = sc.nextLine().split("\\s+");

            String command = tokens[0];

            String petName;
            String clinicName;
            Clinic clinic;
            Pet pet;
            int room;

            switch (command){
                case "Create":
                    if (tokens[1].equals("Pet")){
                        petName = tokens[2];
                        int age = Integer.parseInt(tokens[3]);
                        String kind = tokens[4];
                        pet = new Pet(petName, age, kind);
                        pets.add(pet);
                    }

                    else if (tokens[1].equals("Clinic")){
                        clinicName = tokens[2];
                        int rooms = Integer.parseInt(tokens[3]);

                        if (rooms % 2 == 0)
                            System.out.println("Invalid Operation");

                        else {
                            clinic = new Clinic(clinicName, rooms);
                            clinics.add(clinic);
                        }
                    }
                    break;

                case "Add":
                     pet = pets.stream().filter(p -> p.getName().equals(tokens[1]))
                             .findFirst().orElse(null);

                     clinic = clinics.stream().filter(c -> c.getName().equals(tokens[2]))
                             .findFirst().orElse(null);

                     if (pet != null && clinic != null)
                         System.out.println(clinic.addPet(pet));

                    break;

                case "Release":
                     clinic = clinics.stream().filter(c -> c.getName().equals(tokens[1]))
                            .findFirst().orElse(null);

                     if (clinic != null)
                         System.out.println(Clinic.releasePet(clinic));

                    break;

                case "HasEmptyRooms":
                    clinic = clinics.stream().filter(c -> c.getName().equals(tokens[1]))
                            .findFirst().orElse(null);

                    if (clinic != null)
                        System.out.println(Clinic.hasEmptyRoom(clinic));

                    break;

                case "Print":
                    clinic = clinics.stream().filter(c -> c.getName().equals(tokens[1]))
                            .findFirst().orElse(null);

                    if (clinic != null) {

                        if (tokens.length == 2) {
                            for (Pet p : clinic) {
                                if (p != null)
                                    System.out.println(p.toString());

                                else
                                    System.out.println("Room empty");
                            }

                        }

                        if (tokens.length == 3) {
                            room = Integer.parseInt(tokens[2]);

                            try {
                                pet = clinic.getPets()[room - 1];
                                System.out.println(pet.toString());
                            }

                            catch (NullPointerException ignored){}

                        }
                    }
                    break;
            }
        }
    }
}
