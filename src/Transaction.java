import java.time.LocalDate;

    public class Transaction {

        protected LocalDate date;
        protected BankAccount account;
        protected String transcactionType;

        public Transaction(BankAccount bankAccount) {

            this.account = bankAccount;
            this.date = LocalDate.now();
            this.transcactionType = transcactionType;
        }

        public LocalDate getDate() {
            return date;
        }

    }

