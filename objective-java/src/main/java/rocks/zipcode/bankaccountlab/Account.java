package rocks.zipcode.bankaccountlab;

public abstract class Account {
    private double accountBalance;
    private final int accountNumber;
    private final String accountHolder;


    public Account(String accountHolder, int accountNumber, double accountBalance){
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }
    public Account(String accountHolder,int accountNumber){
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }



    public double getAccountBalance() {
        return this.accountBalance;
    }

    public int getAccountNumber() {
        return this.accountNumber;
    }

    public String getAccountHolder() {
        return this.accountHolder;
    }

    public void deposit(double amount) {
        if (amount > 0 ){
            this.accountBalance += amount;
        } else {
            throw new IllegalArgumentException("Sorry amount can not be 0 or negative");
        }

    }

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
