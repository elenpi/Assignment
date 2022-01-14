import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {

    private List<BankAccount> allBankAcounts;
    //private List<Customer> allCustomers;


    public static void printCustomers(List<Customer> list, List<BankAccount> listAccs) {


        for (BankAccount b : listAccs) {
            List holder = b.getHolders();
            int afm = 0;
            String customer = null;
            for (Customer s : list) {
                if (holder.contains(s)) {
                    customer = s.getCustomerName();
                    afm = s.getCustomerAFM();
                }
            }
            System.out.println("Customer Name: " + customer + ", AFM: " + afm + ", Account: " + b.getAccountNumber());

        }

    }

    public static void printBankAccountReport(List<BankAccount> list, List<Customer> listCustomers) {
        int accNumber = 0;
        LocalDate date = null;
        int balance = 0;
        List<String> names = null;

        for (BankAccount account : list) {
            List holder = account.getHolders();
            names = new ArrayList<>();
            for (Customer customer : listCustomers) {
                if (holder.contains(customer)) {
                    names.add(customer.getCustomerName());
                }
            }
            accNumber = account.getAccountNumber();
            date = account.getAccountDate();
            balance = account.getAccountBalance();
        }
        System.out.println("Account Number: " + accNumber + ", Opening Date: " + date + ", Holders: " + names.toString() + ", Current Balance: " + balance);
    };

    public static void printTransactionsReport(BankAccount account){

        String transactionType = null;
        LocalDate date = null;
        int accountNumber = 0;

        for(Transaction transaction : account.getAccountTransactions()){
            ;


        }
    }

}



