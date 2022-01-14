import java.time.LocalDate;

public class Transfer extends Transaction {

    public Transfer(Customer customer) {

        super(customer);
        this.transcactionType = "Transfrer";

    }

    public static Transfer transfer(int amount, Customer customer, BankAccount fromAccount, BankAccount toAccount) {


        if (fromAccount.getHolders() == toAccount.getHolders()) {
            int fromAccountBalance = fromAccount.getAccountBalance();
            int toAccountBalance = toAccount.getAccountBalance() + amount;
            System.out.println(amount + "$ were transferred to your account. Your new balance is " + toAccountBalance + "$.");
            fromAccountBalance = fromAccountBalance - amount;
            toAccount.setAccountBalance(toAccountBalance);
            fromAccount.setAccountBalance(fromAccountBalance);

            Transfer transfer = new Transfer(customer);
            fromAccount.addTransaction(transfer);

            return transfer;

        } else {
            System.out.println("Money transfer can only occur between a customer's accounts.");
        } return null;
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "date=" + this.date +
                ", customer=" + customer.getCustomerName() +
                ", transcactionType='" + transcactionType + '\'' +
                '}';
    }


}
