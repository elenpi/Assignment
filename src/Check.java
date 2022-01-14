import java.util.Scanner;

public class Check {

    private Customer customer;
    private BankAccount accountNumber;
    private int amount;
    private String recipient;
    private String memo;

    public Check(Customer customer, BankAccount accountNumber, int amount, String recipient, String memo) {
        this.customer = customer;
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.recipient = recipient;
        this.memo = memo;

    }

    public static Check draftCheck(Customer customer, BankAccount fromAccount) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter recipients name:");
        String recipient = scanner.nextLine();

        System.out.println("Please enter the amount:");
        int amount = Integer.valueOf(scanner.nextLine());

        System.out.println("Please write a memo:");
        String memo = scanner.nextLine();

        Check check = new Check(customer, fromAccount, amount, recipient, memo);

        System.out.println( customer.getCustomerName() + ", you have drafted a check from your account " + fromAccount.getAccountNumber() + " for the amout of " + amount + "$ to " + recipient + " with reason : " + memo);

        return check;
    }

    @Override
    public String toString() {
        return "Check{" +
                "customer=" + customer +
                ", accountNumber=" + accountNumber +
                ", amount=" + amount +
                ", recipient='" + recipient + '\'' +
                ", memo='" + memo + '\'' +
                '}';
    }
}
