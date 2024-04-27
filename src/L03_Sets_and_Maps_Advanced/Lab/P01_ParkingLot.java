package L03_Sets_and_Maps_Advanced.Lab;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class P01_ParkingLot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Set<String> parking = new LinkedHashSet<>();

        while (!input.equals("END")){

            String[] tokens = input.split(", ");
            String direction = tokens[0];
            String carNumber = tokens[1];

            if (direction.equals("IN"))
                parking.add(carNumber);

            else
                parking.remove(carNumber);

            input = sc.nextLine();
        }

        if (parking.isEmpty())
            System.out.println("Parking Lot is Empty");

        else {
            for (String carNumber : parking) {
                System.out.println(carNumber);
            }
        }
    }
}
