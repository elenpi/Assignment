public class Withdrawal extends Transaction {

    public Withdrawal(Customer customer) {

       super(customer);
        this.transcactionType = "Withdraw";
    }

    public static Withdrawal withdraw(Customer customer, BankAccount account, int amount) {

        if ( account.getAccountBalance() > 0){
            int newBalance = account.getAccountBalance() - amount;
            account.setAccountBalance(newBalance);
            System.out.println("You new account balance is: " + newBalance + "$.");

            Withdrawal withdrawal = new Withdrawal(customer);
            account.addTransaction(withdrawal);
        } else {
            System.out.println("You account balance doesn't have sufficient funds.");
            Withdrawal nonWithdrawal = null;
        }

        return null;
    }

    @Override
    public String toString() {
        return "Withdrawal{" +
                "date=" + this.date +
                ", customer=" + customer.getCustomerName()+
                ", transcactionType='" + transcactionType + '\'' +
                '}';
    }
}
