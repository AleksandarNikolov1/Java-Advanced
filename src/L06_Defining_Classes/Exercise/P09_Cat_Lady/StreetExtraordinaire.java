package L06_Defining_Classes.Exercise.P09_Cat_Lady;

public class StreetExtraordinaire extends Cat{
    private double decibels;

    public StreetExtraordinaire(String type, String name, double decibels) {
        super(type, name);
        this.decibels = decibels;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getType(), this.getName(), decibels);
    }
}
