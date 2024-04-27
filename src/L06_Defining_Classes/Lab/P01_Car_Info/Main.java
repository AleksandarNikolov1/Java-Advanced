package L06_Defining_Classes.Lab.P01_Car_Info;

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
            String model = carData[1];
            int hp = Integer.parseInt(carData[2]);

            Car car = new Car();

            car.setBrand(brand);
            car.setModel(model);
            car.setHorsepower(hp);

            cars.add(car);
        }

        for (Car car : cars) {
            System.out.print(car.toString());
        }




    }
}
