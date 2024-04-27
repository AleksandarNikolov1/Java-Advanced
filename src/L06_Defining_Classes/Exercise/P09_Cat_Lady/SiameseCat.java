package L06_Defining_Classes.Exercise.P09_Cat_Lady;

public class SiameseCat extends Cat{
    private double earSize;

    public SiameseCat(String type, String name, double earSize) {
        super(type, name);
        this.earSize = earSize;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getType(), this.getName(), earSize);
    }
}
