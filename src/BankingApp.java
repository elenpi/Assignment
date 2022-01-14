import java.util.ArrayList;
import java.util.List;

public class BankingApp {

    public static void main(String[] args) {

        //===============Register a New Customer===================//

        List<Customer> allCustomer = new ArrayList<>();

        Customer papadopoulosI = new Customer("Ioannis Papadopoulos", 123456);

        Customer pippaN = new Customer("Nefeli Pippa", 56789);

         Customer newCustomer = Customer.registerCustomer();

         allCustomer.add(newCustomer);
        allCustomer.add(pippaN);
        allCustomer.add(papadopoulosI);


        System.out.println(" ");
        System.out.println("===============Create Account=================");
        System.out.println(" ");

        List<BankAccount> allBankAccounts = new ArrayList<>();
        List<BankAccount> allTransactions = new ArrayList<>();


        BankAccount account1 = new BankAccount(12345,400);
        account1.addHolder(papadopoulosI);
        account1.addHolder(pippaN);

        BankAccount account3 = new BankAccount(12334567, 1000);
        account3.addHolder(pippaN);
        System.out.println(account1.getHolders());

        allBankAccounts.add(account1);

        System.out.println(account1.toString());

        System.out.println(" ");
        System.out.println("===============Withdraw=================");
        System.out.println(" ");

        Withdrawal.withdraw(account1,100);
        Withdrawal withdrawal = new Withdrawal(account1);
        account1.addTransaction(withdrawal);
        System.out.println(account1.getAccountTransactions());



//        Withdrawal withdrawal = new Withdrawal(account1);
//        ithdrawal.withdraw(account1, 100);
//        System.out.println(withdrawal);
//        account1.addTransaction(withdrawal);
//        System.out.println(account1.getAccountTransactions());
//        System.out.println(account1);
//
//        Withdrawal withdrawalN = new Withdrawal(account1);
//        withdrawalN.withdraw(account1, 50);
//        account1.addTransaction(withdrawalN);
        System.out.println("");
        System.out.println("==============Check==================");
        System.out.println("");
        //===============Check===================////

        Check check1 = new Check(account1,account1,100,"Nefeli Pippa","Pay rent");
        System.out.println(check1.toString());

        System.out.println("");
        System.out.println("==============Deposit==================");
        System.out.println("");

        //===============Deposit===================//


        Deposit deposit = new Deposit(account1);
        deposit.deposit(account1, 20);
        account1.addTransaction(deposit);

        //===============Transfer===================//


//        Transfer transfer = new Transfer(account1);
//        transfer.transfer(10, account1, account3);
//        account1.addTransaction(transfer);


        //===============Reports===================//

        Report.printCustomers(allCustomer,allBankAccounts);
        Report.printBankAccountReport(allBankAccounts,allCustomer);

    }



}
