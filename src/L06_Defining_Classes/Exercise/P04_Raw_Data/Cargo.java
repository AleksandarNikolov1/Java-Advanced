package L06_Defining_Classes.Exercise.P04_Raw_Data;

public class Cargo {
    private int weight ;
    private String type;

    public Cargo(int weight, String type) {
        this.weight = weight;
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
