package L01_Stacks_and_Queues.Lab;

import java.util.ArrayDeque;
import java.util.Scanner;

public class P08_BrowserHistoryUpdate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayDeque<String> history = new ArrayDeque<>();

        String url = sc.nextLine();

        while (!url.equals("Home")){

            if (url.equals("forward")){

            }
            else if (url.equals("back")){

            }
            else{
                history.offer(url);
                history.poll();
            }

            url = sc.nextLine();
        }
    }
}
