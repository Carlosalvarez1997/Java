public class BankTest {
    public static void main(String[] args){
        // Create 3 bank accounts
        BankAccount carlosAccount= new BankAccount(100, 200);
        BankAccount crystalAccount = new BankAccount(500, 4000);
        BankAccount jasmineAccount= new BankAccount(200, 500);
        BankAccount xochitlAccount = new BankAccount(10000, 500000);

        // Deposit Test
        // - deposit some money into each bank account's checking or savings account and display the balance each time
        // - each deposit should increase the amount of totalMoney
        carlosAccount.depositMoney(100, "Savings");
        carlosAccount.depositMoney(100, "checking");
        System.out.println(xochitlAccount.getAccountNumber());


        // Withdrawal Test
        // - withdraw some money from each bank account's checking or savings account and display the remaining balance
        // - each withdrawal should decrease the amount of totalMoney
        // Static Test (print the number of bank accounts and the totalMoney)
    }
}
