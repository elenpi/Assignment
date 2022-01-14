import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Report {

    public static void printCustomers(List<Customer> listCustomers, List<BankAccount> listAccounts) {

        System.out.println("Customers Report:");
        System.out.println("=================");

        for (BankAccount account : listAccounts) {
            List<Customer> holder = account.getHolders();
            int afm = 0;
            String customerName = null;
            for (Customer customer : listCustomers) {
                if (holder.contains(customer)) {
                    customerName = customer.getCustomerName();
                    afm = customer.getCustomerAFM();
                }
            }
            System.out.println("+ Customer Name: " + customerName + ", AFM: " + afm + ", Account: " + account.getAccountNumber());

        }

    }

    public static void printBankAccountReport(List<BankAccount> list, List<Customer> listCustomers) {
        int accNumber = 0;
        LocalDate date = null;
        int balance = 0;
        List<String> names = null;

        System.out.println("Bank Accounts Report:");
        System.out.println("=====================");

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
            System.out.println("+ Account Number: " + accNumber + ", Opening Date: " + date + ", Holders: " + names.toString() + ", Current Balance: " + balance);

        }
    }

    ;

    public static void printTransactionsReport(BankAccount account) {

        System.out.println("Transactions History Report for the Account " + account.getAccountNumber() + ":");
        System.out.println("=====================================================");

        for (Transaction transaction : account.getAccountTransactions()) {
            Customer customer = transaction.getCustomer();
            String name = customer.getCustomerName();

            System.out.println("+ Transaction Type: " + transaction.getTranscactionType() + " Preformed by: " + name + ", Date: " + transaction.getDate());
        }
    }

}



