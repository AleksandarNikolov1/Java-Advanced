package L06_Defining_Classes.Exercise.P05_Car_Salesman;

public class Engine {
    private String model;
    private int power;
    private Integer displacement;
    private String efficiency;

    public Engine(String model, int power) {
        this.model = model;
        this.power = power;
        this.displacement = null;
        this.efficiency = "n/a";
    }

    public String getModel() {
        return model;
    }

    public void setDisplacement(int displacement) {
        this.displacement = displacement;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setEfficiency(String efficiency) {
        this.efficiency = efficiency;
    }

    public String getEfficiency() {
        return efficiency;
    }

    public int getPower() {
        return power;
    }
}
