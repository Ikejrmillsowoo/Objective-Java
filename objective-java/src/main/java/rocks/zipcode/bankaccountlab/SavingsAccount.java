package rocks.zipcode.bankaccountlab;

public class SavingsAccount extends Account{
    public SavingsAccount(String accountHolder, int accountNumber, double accountBalance) {
        super(accountHolder, accountNumber, accountBalance);
    }

    @Override
    public double getAccountBalance() {
        return this.accountBalance;
    }

    @Override
    public int getAccountNumber() {
        return this.accountNumber;
    }

    @Override
    public String getAccountHolder() {
        return this.accountHolder;
    }

    @Override
    public void deposit(double amount) {
        if (amount > 0) {
            this.accountBalance += amount;
        } else {
            throw new IllegalArgumentException("Sorry amount can not be 0 or negative");
        }
    }

    @Override
    public void withdrawal(double amount) {
        if (amount < this.accountBalance && amount > 0){
            this.accountBalance -= amount;
        } else if (amount <= 0){
            throw new IllegalArgumentException("Sorry amount can not be 0 or negative");
        }
        else {
            throw new IllegalStateException("Withdrawal amount can not be less than current balance");
        }
    }
}
