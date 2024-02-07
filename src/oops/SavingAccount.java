package oops;

public class SavingAccount extends BankAccount{
    public SavingAccount(String accountNum, double balance) {
        super(accountNum, balance);
    }

    @Override
    void deposit(double amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of $" + amount + "successful. Current balance: $" + getBalance());
    }

    @Override
    void withdraw(double amount) {
        if(getBalance() >= amount){
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal of $" + amount + " successful.");
        }else {
            System.out.println("Insufficent fund. Withdrawal failed.");
        }

    }
}
