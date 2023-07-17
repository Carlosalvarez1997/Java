import java.util.Random;
public class BankAccount {
    // MEMBER VARIABLES
    private double checkingBalance;
    private double savingsBalance;
    private Integer accountNumber =64597890;

    //static belongs to the bank account
    private static int accounts = 0;
    private static double totalMoney = 0; // refers to the sum of all bank account checking and savings balances


    // CONSTRUCTOR
    public BankAccount(){
        this.accountNumber = getRandomAccountNum();
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }

    public BankAccount(double checkingBalance, double savingsBalance){
        BankAccount.accounts ++;
        this.accountNumber = getRandomAccountNum();
        this.checkingBalance = checkingBalance;
        this.savingsBalance = savingsBalance;
    }


    private Integer getRandomAccountNum(){
        Random rand = new Random();
        Integer accountNumRan = rand.nextInt(1000000000);
        return (accountNumRan+1000000);

    }

    // GETTERS
    // for checking, savings, accounts, and totalMoney
    public double getCheckingBalance (){
        return this.checkingBalance;
    }

    public  double setCheckingBalance(double checkingBalance){
        return this.checkingBalance = checkingBalance;
    }

    public double getSavingsBalance(){
        return this.savingsBalance;
    }

    public double setSavingsBalance(double savingsBalance){
        return this.savingsBalance = savingsBalance;
    }
    public long getAccountNumber(){
        return this.accountNumber;
    }



    // METHODS
    // deposit
    // - users should be able to deposit money into their checking or savings account
    public void depositMoney(double amount, String account){
        //check which account to deposit too
        if (account == "checking" || account == "checkings"){
            this.checkingBalance += amount;
        }
        else{
            this.savingsBalance += amount;
        }
        BankAccount.totalMoney+= amount;
    }



    // - users should be able to withdraw money from their checking or savings account
    // withdraw
    // - do not allow them to withdraw money if there are insufficient funds
        // - all deposits and withdrawals should affect totalMoney
    public double withdrawl(double amount, int account){
        if(amount <= account){
        account-= amount;
        totalMoney-= amount;
        return account;
        }
        else {
            System.out.println("Not enough Funds");
            return account;
        }
    }
    // getBalance
    public double getBalance(double account){
        return this.checkingBalance;

    }
    // - display total balance for checking and savings of a particular bank account
    public double getTotalBalance(){
        return this.checkingBalance + this.savingsBalance;
    }

}
