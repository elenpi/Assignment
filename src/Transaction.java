import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class Transaction {

    protected LocalDate date;
    protected String transcactionType;
    protected Customer customer;

    public Transaction(Customer customer) {

        this.date = LocalDate.now();
        this.transcactionType = transcactionType;
        this.customer = customer;
    }

    public LocalDate getDate() {
        return date;
    }

    public String getTranscactionType() {
        return transcactionType;
    }

    public Customer getCustomer() {
        return customer;
    }

//    public static void transactionsMenu(Customer customer, BankAccount account, List<BankAccount> listAccounts){
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please select a transaction:");
//        System.out.println("To withdraw money from an account enter: 1");
//        System.out.println("To deposit money to an account enter: 2");
//        System.out.println("To transfer money between your accounts enter: 3");
//
//        int input = Integer.valueOf(scanner.nextLine());
//
//        switch (input) {
//            case 1:
//                System.out.println("Please enter the amount you want to withdraw: ");
//                int amountWithdraw = Integer.valueOf(scanner.nextLine());
//                Withdrawal.withdraw(customer,account, amountWithdraw);
//                break;
//            case 2:
//                System.out.println("Please enter the amount you want to deposit: ");
//                int amountDeposit = Integer.valueOf(scanner.nextLine());
//                Deposit.deposit(customer,account,amountDeposit);
//                break;
//            case 3:
//                System.out.println("Please select the account from which you want to transfer money from:");
//
//                for (BankAccount acc : listAccounts){
//                        if(listAccounts.contains(customer.getCustomerName())){
//                            System.out.println(acc.getAccountNumber());
//                    }
//                }
//                System.out.println("Please enter the amount you want to transfer: ");
//                int amountTransfer = Integer.valueOf(scanner.nextLine());
//                break;
//            default:
//                System.out.println("Goodbuye!");
//            break;
//        }
//
//    }

}


