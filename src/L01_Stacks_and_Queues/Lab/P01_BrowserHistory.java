package L01_Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P01_BrowserHistory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> history = new ArrayDeque<>();

        String url = sc.nextLine();

        while (!url.equals("Home")) {

            if (!url.equals("back")) {
                history.push(url);
                System.out.println(history.peek());
            }

            else {
                if (history.size() > 1) {
                    history.pop();
                    System.out.println(history.peek());
                } else {
                    System.out.println("no previous URLs");
                }
            }

            url = sc.nextLine();
        }
    }
}
