package L06_Defining_Classes.Lab.P03_Bank_Account;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();

        Map<Integer, BankAccount> bankAccounts = new LinkedHashMap<>();

        while (!input.equals("End")) {
            String[] tokens = input.split("\\s+");

            String command = tokens[0];

            switch (command) {
                case "Create":
                    BankAccount account = new BankAccount();
                    bankAccounts.put(account.getId(), account);
                    System.out.printf("Account ID%d created%n", account.getId());
                    break;

                case "Deposit":
                    int id = Integer.parseInt(tokens[1]);
                    int amount = Integer.parseInt(tokens[2]);

                    if (bankAccounts.containsKey(id)) {
                        bankAccounts.get(id).deposit(amount);
                        System.out.printf("Deposited %d to ID%d%n", amount, id);
                    }

                    else {
                        System.out.printf("Account does not exist%n");
                    }
                    break;

                case "SetInterest":
                    double interest = Double.parseDouble(tokens[1]);
                    BankAccount.setInterest(interest);
                    break;

                case "GetInterest":
                    int ID = Integer.parseInt(tokens[1]);
                    int years = Integer.parseInt(tokens[2]);

                    if (bankAccounts.containsKey(ID)){
                       double accountInterest =  bankAccounts.get(ID).getInterest(years);
                        System.out.printf("%.2f%n", accountInterest);
                    }

                    else
                        System.out.printf("Account does not exist%n");
                    break;
            }

            input = sc.nextLine();
        }
    }
}
