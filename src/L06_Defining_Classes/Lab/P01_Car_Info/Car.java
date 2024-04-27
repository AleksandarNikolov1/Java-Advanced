package L06_Defining_Classes.Lab.P01_Car_Info;

public class Car {
    private String brand;
    private String model;
    private int horsepower;

    public Car(){

    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setHorsepower(int horsepower) {
        this.horsepower = horsepower;
    }

    @Override
    public String toString() {
        return String.format("The car is: %s %s - %d HP.%n",
                this.brand, this.model, this.horsepower);
    }
}
