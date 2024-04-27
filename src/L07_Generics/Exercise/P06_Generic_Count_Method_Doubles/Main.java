package L07_Generics.Exercise.P06_Generic_Count_Method_Doubles;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

       Box<Double> box = new Box<>();

        while (n-- > 0){
            double num = Double.parseDouble(sc.nextLine());
            box.addElement(num);
        }

        double numToCompare = Double.parseDouble(sc.nextLine());

        int greaterElementsCount = box.getGreaterElementsCount(numToCompare);

        System.out.println(greaterElementsCount);
    }
}
