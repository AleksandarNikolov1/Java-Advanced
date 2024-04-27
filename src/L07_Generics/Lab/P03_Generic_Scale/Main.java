package L07_Generics.Lab.P03_Generic_Scale;

public class Main {
    public static void main(String[] args) {
        Scale<String> stringScale = new Scale<>("a", "c");
        System.out.println(stringScale.getHeavier());

        Scale<Integer> integerScale = new Scale<>(1, 2);
        System.out.println(integerScale.getHeavier());
    }
}
