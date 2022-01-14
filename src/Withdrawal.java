public class Withdrawal extends Transaction {

    public Withdrawal(BankAccount account) {

       super(account);
        this.transcactionType = "Withdraw";
    }

    public static void withdraw(BankAccount account, int amount) {

        if ( account.getAccountBalance() > 0){
            int newBalance = account.getAccountBalance() - amount;
            account.setAccountBalance(newBalance);
            System.out.println("You account new account balance is: " + newBalance + "$.");
        } else {
            System.out.println("You account balance doesn't have sufficient funds.");
        }

    }


    @Override
    public String toString() {
        return "Withdrawal{" +
                "transcactionType='" + this.transcactionType +
                ", date=" + this.date +
                ", account=" + account.getAccountNumber() + '\'' +
                '}';
    }
}
