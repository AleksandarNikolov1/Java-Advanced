package L03_Sets_and_Maps_Advanced.Exercise;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class P05_PhoneBook {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String contact = sc.nextLine();

        Map<String, String> contacts = new HashMap<>();

        while (!contact.equals("search")){

            String contactName = contact.split("-")[0];
            String phoneNumber = contact.split("-")[1];

            contacts.put(contactName, phoneNumber);

            contact = sc.nextLine();
        }

        String searchingName = sc.nextLine();

        while (!searchingName.equals("stop")){

            if (contacts.containsKey(searchingName))
                System.out.printf("%s -> %s%n", searchingName, contacts.get(searchingName));

            else
                System.out.printf("Contact %s does not exist.%n", searchingName);

            searchingName = sc.nextLine();
        }
    }
}
