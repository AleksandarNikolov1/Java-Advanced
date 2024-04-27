package L06_Defining_Classes.Exercise.P09_Cat_Lady;

public class CymricCat extends Cat {
    private double furLength;

    public CymricCat(String type, String name, double furLength) {
        super(type, name);
        this.furLength = furLength;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getType(), this.getName(), furLength);
    }
}

