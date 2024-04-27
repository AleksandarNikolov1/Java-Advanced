package L06_Defining_Classes.Exercise.P03_Speed_Racing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0){
            String[] tokens = sc.nextLine().split("\\s+");
            String carModel = tokens[0];
            double fuelAmount = Double.parseDouble(tokens[1]);
            double fuelCostPer1km = Double.parseDouble(tokens[2]);

            Car car = new Car(carModel, fuelAmount, fuelCostPer1km);

            cars.add(car);
        }

        String input = sc.nextLine();

        while (!input.equals("End")){
            String[] tokens = input.split("\\s+");
            String carModel = tokens[1];
            int traveledKms = Integer.parseInt(tokens[2]);

            cars.stream().filter(c -> c.getModel().equals(carModel))
                    .findFirst().ifPresent(car -> car.drive(traveledKms));

            input = sc.nextLine();
        }

        for (Car car : cars) {
            System.out.println(car.toString());
        }
    }
}
