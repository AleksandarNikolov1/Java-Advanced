package L05_Functional_Programming.Lab;

import java.util.Arrays;
import java.util.Scanner;
import java.util.function.UnaryOperator;

public class P04_AddVAT {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double[] prices = Arrays.stream(sc.nextLine().split(", "))
                .mapToDouble(Double::parseDouble).toArray();

        UnaryOperator<Double> addVat = d -> d * 1.2;

        System.out.println("Prices with VAT:");
        for (double price : prices) {
            price = addVat.apply(price);
            System.out.printf("%.2f%n", price);
        }
    }
}
