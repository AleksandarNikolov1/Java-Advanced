package L07_Generics.Lab.P01_Jar_Of_T;

public class Main {
    public static void main(String[] args) {

        Jar<String> jarOfStrings = new Jar<>();

        jarOfStrings.add("String1");
        jarOfStrings.add("String2");
        jarOfStrings.remove();

        Jar<Integer> jarOfInts = new Jar<>();

        jarOfInts.add(1);
        jarOfInts.add(2);
        jarOfInts.remove();

        for (int n : jarOfInts.getStack()) {
            System.out.println(n);

        }
        for (String s : jarOfStrings.getStack()) {
            System.out.println(s);
        }
    }
}
