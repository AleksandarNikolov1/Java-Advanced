package L06_Defining_Classes.Lab.P02_Car_Constructors;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

        List<Car> cars = new ArrayList<>();

        while (n-- > 0){
            String[] carData = sc.nextLine().split(" ");

            String brand = carData[0];

            Car car;

            if (carData.length == 3){
                String model = carData[1];
                int hp = Integer.parseInt(carData[2]);
                car = new Car(brand, model, hp);
            }

            else
                car = new Car(brand);

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.print(car.toString());
        }




    }
}
