package L06_Defining_Classes.Exercise.P04_Raw_Data;

import java.util.Arrays;
import java.util.List;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private List<Tire> tires;

    public Car(String model, int engineSpeed, int enginePower, int cargoWeight, String cargoType,
               double tire1Pressure, int tire1Age, double tire2Pressure, int tire2Age,
               double tire3Pressure, int tire3Age, double tire4Pressure, int tire4Age) {
        this.model = model;
        this.engine = new Engine(engineSpeed, enginePower);
        this.cargo = new Cargo(cargoWeight, cargoType);
        this.tires = Arrays.asList(new Tire(tire1Pressure, tire1Age),
                                   new Tire(tire2Pressure, tire2Age),
                                   new Tire(tire3Pressure, tire3Age),
                                   new Tire(tire4Pressure, tire4Age));
    }

    public String getModel() {
        return model;
    }

    public Engine getEngine() {
        return engine;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public List<Tire> getTires() {
        return tires;
    }
}
