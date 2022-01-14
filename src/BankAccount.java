import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Scanner;

public class BankAccount {

    //===============Instance Variable===================//

    private int accountNumber;
    private LocalDate accountDate;
    private List<Customer> holders;
    private int accountBalance;
    private List<Transaction> accountTransactions;

    //===============Constructors===================//

    public BankAccount(int accountNumber, int accountBalance) {

        this.accountNumber = accountNumber;
        this.accountDate = LocalDate.now();
        this.accountBalance = accountBalance;
        this.accountTransactions = new ArrayList<>();
        this.holders = new ArrayList<>();
    }


    //===============Methods===================//


    // Method to add the date of account's opening
    public LocalDate getAccountDate() {
        return accountDate;
    }

    // Method to add a customer holder to an account
    public void addHolder(Customer holder) {

        if (this.holders.size() == 2) {
            System.out.println("The account has reached the limit of maximum account holders");
            return;
        }
        this.holders.add(holder);
    }

    public static BankAccount createAccount(List<Customer> list) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("To open a new account, please enter you name, since you are an existing customer:");
        String input = scanner.nextLine();


        for (Customer customer : list)
            if (Objects.equals(customer.getCustomerName(), input)) {

                BankAccount account = new BankAccount(1234456, 0);

                System.out.println(input + ", you have successfully opened a new acount " + account.getAccountNumber() + " and your current balance is " + account.getAccountBalance());

                return account;
            } else {
                break;
            }
        System.out.println("Sorry, you can only open an account if you are an existing customer.");
        return null;
    }


    // Method to add a transaction to a list
    public void addTransaction(Transaction transaction) {

        this.accountTransactions.add(transaction);
    }

    public void addAccount() {

    }

    // Method to get the account transactions
    public List<Transaction> getAccountTransactions() {
        return accountTransactions;
    }

    // Method to add get the account number
    public int getAccountNumber() {
        return accountNumber;
    }

    // Method to add get the account holder(s)
    public List<Customer> getHolders() {
        return holders;
    }

    // Method to add get the account balance
    public int getAccountBalance() {
        return accountBalance;
    }

    // Method to add set the account balance
    public void setAccountBalance(int accountBalance) {
        this.accountBalance = accountBalance;
    }

    @Override
    public String toString() {
        return "BankAccount{" +
                "accountNumber=" + accountNumber +
                ", accountDate=" + accountDate +
                ", holders=" + holders +
                ", accountBalance=" + accountBalance +
                ", accountTransactions=" + accountTransactions.toString() +
                '}';
    }
}
