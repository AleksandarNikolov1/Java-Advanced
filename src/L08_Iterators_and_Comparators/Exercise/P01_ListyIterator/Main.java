package L08_Iterators_and_Comparators.Exercise.P01_ListyIterator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String command = sc.nextLine();

        List<String> strings = new ArrayList<>();
        ListyIterator listyIterator = new ListyIterator(strings);

        while (!command.equals("END")){

            if (command.contains("Create")){
                String[] tokens = command.split("\\s+");
                if (tokens.length > 1){
                    strings.addAll(Arrays.asList(tokens).subList(1, tokens.length));
                }
            }

            else if (command.equals("Move")){
                if (listyIterator.hasNext())
                    System.out.println(listyIterator.move());
            }

            else if (command.equals("HasNext")){
                System.out.println(listyIterator.hasNext());
            }

            else if (command.equals("Print")){
                listyIterator.print();
            }

            command = sc.nextLine();
        }
    }
}
