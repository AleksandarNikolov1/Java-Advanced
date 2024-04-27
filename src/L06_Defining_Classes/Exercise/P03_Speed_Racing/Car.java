package L06_Defining_Classes.Exercise.P03_Speed_Racing;

public class Car {
    private String model;
    private double fuelAmount;
    private double fuelCostPer1km;
    private int distanceTraveled;

    public Car(String model, double fuelAmount, double fuelCostPer1km) {
        this.model = model;
        this.fuelAmount = fuelAmount;
        this.fuelCostPer1km = fuelCostPer1km;
        this.distanceTraveled = 0;
    }

    public void drive(int distance){
        double fuelCost = fuelCostPer1km * distance;

        if (fuelCost > fuelAmount){
            System.out.println("Insufficient fuel for the drive");
        }

        else {
            fuelAmount -= fuelCost;
            distanceTraveled += distance;

        }
    }

    public String getModel() {
        return model;
    }

    @Override
    public String toString() {
        return String.format("%s %.2f %d", model, fuelAmount, distanceTraveled);
    }
}
