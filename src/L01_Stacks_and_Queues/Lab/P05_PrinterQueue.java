package L01_Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P05_PrinterQueue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String file = sc.nextLine();

        ArrayDeque<String> queue = new ArrayDeque<>();

        while (!file.equals("print")){

            if (!file.equals("cancel")){
                queue.offer(file);
            }
            else {
               String canceledFile = queue.poll();
               if (canceledFile != null)
                   System.out.printf("Canceled %s%n", canceledFile);
               else
                   System.out.println("Printer is on standby");
            }
            file = sc.nextLine();
        }

        for (String f : queue) {
            System.out.println(f);
        }
    }
}
