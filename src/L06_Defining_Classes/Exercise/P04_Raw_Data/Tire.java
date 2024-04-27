package L06_Defining_Classes.Exercise.P04_Raw_Data;

import java.util.List;

public class Tire {
    private double pressure;
    private int age;

    public Tire(double pressure, int age) {
        this.pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return pressure;
    }

    public static boolean checkIfTirePressureIsLessThan1 (List<Tire> tires){

        for (Tire tire : tires) {
            if (tire.getPressure() < 1){
                return true;
            }
        }
        return false;
    }
}
