package L06_Defining_Classes.Exercise.P09_Cat_Lady;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        List<Cat> cats = new ArrayList<>();

        String input = sc.nextLine();

        while (!input.equals("End")){
            String[] catData = input.split("\\s+");
            String type = catData[0];
            String name = catData[1];
            double characteristic = Double.parseDouble(catData[2]);

            Cat cat = null;

            switch (type){
                case "StreetExtraordinaire":
                    cat = new StreetExtraordinaire(type, name, characteristic);
                    break;
                case "Siamese":
                    cat = new SiameseCat(type, name, characteristic);
                    break;
                case "Cymric":
                    cat = new CymricCat(type, name, characteristic);
                    break;
            }

            cats.add(cat);

            input = sc.nextLine();
        }

        String name = sc.nextLine();

        cats.forEach(c -> {
            if (c.getName().equals(name)) {
                System.out.println(c.toString());
            }
        });
    }
}
