package L06_Defining_Classes.Lab.P03_Bank_Account;

public class BankAccount {
    private final static double DEFAULT_INTEREST_RATE = 0.02;
    private static int accountsCounter = 1;
    private static double interestRate = DEFAULT_INTEREST_RATE;

    private int id;
    private double balance;


    public BankAccount(){
        this.id = accountsCounter;
        accountsCounter ++;
    }

    public static void setInterest(double interest){
        BankAccount.interestRate = interest;
    }

    public double getInterest(int years){
        return BankAccount.interestRate * this.balance * years;
    }

    public void deposit(double amount){
        this.balance += amount;
    }

    public int getId() {
        return id;
    }
}
