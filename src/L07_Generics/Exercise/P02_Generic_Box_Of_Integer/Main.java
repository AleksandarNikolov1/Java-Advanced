package L07_Generics.Exercise.P02_Generic_Box_Of_Integer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());

        Box<Integer> box = new Box<>();

        while (n-- > 0){
            int num = Integer.parseInt(sc.nextLine());
            box.addElement(num);
        }

        System.out.println(box.toString());
    }
}
