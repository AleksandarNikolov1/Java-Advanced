package L01_Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P03_DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = Integer.parseInt(sc.nextLine());
        ArrayDeque<Integer> binaryDigit = new ArrayDeque<>();


        if (n > 0) {
            while (n != 0) {
                binaryDigit.push(n % 2);
                n /= 2;
            }
        }

        else
            binaryDigit.push(0);

        for (Integer num : binaryDigit) {
            System.out.print(binaryDigit.pop());
        }
    }
}
