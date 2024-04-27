package L07_Generics.Exercise.P05_Generic_Count_Method_String;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());

       Box<String> box = new Box<>();

        while (n-- > 0){
            String input = sc.nextLine();
            box.addElement(input);
        }

        String stringToCompare = sc.nextLine();

        int greaterElementsCount = box.getGreaterElementsCount(stringToCompare);

        System.out.println(greaterElementsCount);
    }
}
