package L10_Exams.Regular_Exam.dealership;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Dealership {
    private String name;
    private int capacity;
    private List<Car> cars;

    public Dealership(String name, int capacity) {
        this.name = name;
        this.capacity = capacity;
        this.cars = new ArrayList<>();
    }

    public void add(Car car){
       if (capacity > cars.size())
           cars.add(car);
    }

    public boolean buy(String manufacturer, String model){
       return cars.removeIf(c -> c.getManufacturer().equals(manufacturer) && c.getModel().equals(model));
    }

    public Car getLatestCar(){
        return cars.stream().max(Comparator.comparingInt(Car::getYear)).orElse(null);
    }

    public Car getCar(String manufacturer, String model){
        return cars.stream().filter(c -> c.getManufacturer().equals(manufacturer) &&
                c.getModel().equals(model)).findFirst().orElse(null);
    }

    public int getCount(){
        return cars.size();
    }

    public String getStatistics(){
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("The cars are in a car dealership %s:%n", name));
        for (Car car : cars) {
            sb.append(car.toString());
            sb.append(System.lineSeparator());
        }

        return sb.toString();
    }


}
