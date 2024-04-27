package L07_Generics.Exercise.P10_Tuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Tuple<String, String> firstTuple = new Tuple<>();
        Tuple<String, Integer> secondTuple = new Tuple<>();
        Tuple<Integer, Double> thirdTuple = new Tuple<>();

        String firsLineInput = sc.nextLine();
        String fullName = firsLineInput.split("\\s+")[0] + " " + firsLineInput.split("\\s+")[1];
        String address = firsLineInput.split("\\s+")[2];

        String secondLineInput = sc.nextLine();
        String name = secondLineInput.split("\\s+")[0];
        int amountOfBeers = Integer.parseInt(secondLineInput.split("\\s+")[1]);

        String thirdLineInput = sc.nextLine();
        int firstNum = Integer.parseInt(thirdLineInput.split("\\s+")[0]);
        double secondNum = Double.parseDouble(thirdLineInput.split("\\s+")[1]);

        firstTuple.setKey(fullName);
        firstTuple.setValue(address);

        secondTuple.setKey(name);
        secondTuple.setValue(amountOfBeers);

        thirdTuple.setKey(firstNum);
        thirdTuple.setValue(secondNum);

        System.out.println(firstTuple.toString());
        System.out.println(secondTuple.toString());
        System.out.println(thirdTuple.toString());

    }
}
