package L06_Defining_Classes.Exercise.P04_Raw_Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0) {
            String[] carData = sc.nextLine().split("\\s+");
            String carModel = carData[0];
            int engineSpeed = Integer.parseInt(carData[1]);
            int enginePower = Integer.parseInt(carData[2]);
            int cargoWeight = Integer.parseInt(carData[3]);
            String cargoType = carData[4];
            double tire1Pressure = Double.parseDouble(carData[5]);
            int tire1Age = Integer.parseInt(carData[6]);
            double tire2Pressure = Double.parseDouble(carData[7]);
            int tire2Age = Integer.parseInt(carData[8]);
            double tire3Pressure = Double.parseDouble(carData[9]);
            int tire3Age = Integer.parseInt(carData[10]);
            double tire4Pressure = Double.parseDouble(carData[11]);
            int tire4Age = Integer.parseInt(carData[12]);

            Car car = new Car(carModel, engineSpeed, enginePower, cargoWeight, cargoType,
                    tire1Pressure, tire1Age, tire2Pressure, tire2Age, tire3Pressure, tire3Age,
                    tire4Pressure, tire4Age);

            cars.add(car);
        }

        String cargoType = sc.nextLine();

        if (cargoType.equals("fragile")) {
            cars.stream().filter(c -> c.getCargo().getType().equals(cargoType) &&
                            Tire.checkIfTirePressureIsLessThan1(c.getTires()))
                    .forEach(c -> System.out.println(c.getModel()));

            
        } else if (cargoType.equals("flamable")) {
            cars.stream().filter(c -> c.getCargo().getType().equals(cargoType) &&
                            c.getEngine().getPower() > 250)
                    .forEach(c -> System.out.println(c.getModel()));
        }
    }
}
