package L03_Sets_and_Maps_Advanced.Lab;

import java.util.*;

public class P02_SoftUniParty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        Set<String> guestList = new TreeSet<>();

        String guestCode = sc.nextLine();

        while (!guestCode.equals("PARTY")){

            guestList.add(guestCode);
            guestCode = sc.nextLine();
        }

        String comingGuest = sc.nextLine();

        while (!comingGuest.equals("END")){

            guestList.remove(comingGuest);

            comingGuest = sc.nextLine();
        }

        System.out.println(guestList.size());
        guestList.forEach(System.out::println);
    }
}
