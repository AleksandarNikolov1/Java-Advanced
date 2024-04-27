package L07_Generics.Exercise.P11_Threeuple;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Threeuple<String, String, String> firstTuple = new Threeuple<>();
        Threeuple<String, Integer, Boolean> secondTuple = new Threeuple<>();
        Threeuple<String, Double, String> thirdTuple = new Threeuple<>();

        String firsLineInput = sc.nextLine();
        String fullName = firsLineInput.split("\\s+")[0] + " " + firsLineInput.split("\\s+")[1];
        String address = firsLineInput.split("\\s+")[2];
        String town = firsLineInput.split("\\s+")[3];

        String secondLineInput = sc.nextLine();
        String name = secondLineInput.split("\\s+")[0];
        int amountOfBeers = Integer.parseInt(secondLineInput.split("\\s+")[1]);
        boolean isDrunk = secondLineInput.split("\\s")[2].equals("drunk");

        String thirdLineInput = sc.nextLine();
        String name2 = thirdLineInput.split("\\s+")[0];
        double accountBalance = Double.parseDouble(thirdLineInput.split("\\s+")[1]);
        String bankName = thirdLineInput.split("\\s+")[2];

        firstTuple.setItems(fullName, address, town);

        secondTuple.setItems(name, amountOfBeers, isDrunk);

        thirdTuple.setItems(name2, accountBalance, bankName);

        System.out.println(firstTuple.toString());
        System.out.println(secondTuple.toString());
        System.out.println(thirdTuple.toString());
    }
}
