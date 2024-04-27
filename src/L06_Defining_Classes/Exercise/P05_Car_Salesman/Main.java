package L06_Defining_Classes.Exercise.P05_Car_Salesman;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Engine> engines = new ArrayList<>();

        while (n-- > 0) {
            String[] engineData = sc.nextLine().split("\\s+");
            String engineModel = engineData[0];
            int enginePower = Integer.parseInt(engineData[1]);

            Engine engine = new Engine(engineModel, enginePower);

            if (engineData.length == 3){
                if (Character.isDigit(engineData[2].charAt(0))){
                    int engineDisplacement = Integer.parseInt(engineData[2]);
                    engine.setDisplacement(engineDisplacement);
                }

                else{
                    String engineEfficiency = engineData[2];
                    engine.setEfficiency(engineEfficiency);
                }
            }

            else if (engineData.length == 4){
                int engineDisplacement = Integer.parseInt(engineData[2]);
                String engineEfficiency = engineData[3];
                engine.setDisplacement(engineDisplacement);
                engine.setEfficiency(engineEfficiency);
            }

            engines.add(engine);
        }

        int m = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();

        while (m-- > 0) {
            String[] carData = sc.nextLine().split("\\s+");
            String carModel = carData[0];
            String engineModel = carData[1];

            Engine engine = new Engine(engineModel, 0);

            for (Engine e : engines) {
                if (e.getModel().equals(engineModel))
                    engine = e;
            }

            Car car = new Car(carModel, engine);

            if (carData.length == 3){
                if (Character.isDigit(carData[2].charAt(0))){
                    int carWeight = Integer.parseInt(carData[2]);
                    car.setWeight(carWeight);
                }
                else{
                    String carColor = carData[2];
                    car.setColor(carColor);
                }
            }

            else if (carData.length == 4){
                int carWeight = Integer.parseInt(carData[2]);
                String carColor = carData[3];
                car.setWeight(carWeight);
                car.setColor(carColor);
            }

            cars.add(car);

        }

        for (Car car : cars) {
            String output = car.toString();

            if (output.contains("null"))
                output = output.replace("null", "n/a");

            System.out.print(output);
        }
    }
}
