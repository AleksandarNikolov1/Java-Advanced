package L07_Generics.Exercise.P01_Generic_Box;

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

        System.out.println(box.toString());
    }
}
