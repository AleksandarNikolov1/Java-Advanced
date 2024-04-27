package L06_Defining_Classes.Exercise.P05_Car_Salesman;

public class Car {
    private String model;
    private Engine engine;
    private Integer weight;
    private String color;

    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.weight = null;
        this.color = "n/a";
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("%s:%n  %s:%n    Power: %d%n    Displacement: %d%n    Efficiency: %s%n  Weight: %d%n  Color: %s%n",
                this.model, this.engine.getModel(), this.engine.getPower(), this.engine.getDisplacement(),
                this.engine.getEfficiency(), this.weight, this.color);
    }
}
