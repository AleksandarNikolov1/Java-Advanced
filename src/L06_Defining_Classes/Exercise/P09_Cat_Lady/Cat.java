package L06_Defining_Classes.Exercise.P09_Cat_Lady;

public abstract class Cat {

    private String type;
    private String name;

    public Cat(String type, String name){
        this.type = type;
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%s %s %.2f", this.getType(), this.getName(), 0.00);
    }
}
