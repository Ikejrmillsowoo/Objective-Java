package rocks.zipcode.bankaccountlab;

public abstract class Account {
    double accountBalance;
    final int accountNumber;
    final String accountHolder;


    public Account(String accountHolder, int accountNumber, double accountBalance) {
        this.accountHolder = accountHolder;
        this.accountBalance = accountBalance;
        this.accountNumber = accountNumber;
    }

    public Account(String accountHolder, int accountNumber) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
    }


    public abstract double getAccountBalance();


    public abstract int getAccountNumber();

    public abstract String getAccountHolder();

    public abstract void deposit(double amount);

    public abstract void withdrawal(double amount);

}
