package rocks.zipcode.bankaccountlab;

import java.util.Scanner;
import java.util.function.Function;

/**
 * Created by leon on 1/10/18.
 */
public class BankAccount{


//    public BankAccount(String accountHolder, int accountNumber) {
//        super(accountHolder, accountNumber);
//    }

    //create userInputs
    public String getUserInput(String string){
        System.out.println(string);
        System.out.println("input: ");
        Scanner sc = new Scanner(System.in);
        return sc.next();
    }

    public void setUserPin() {
        String userPin = getUserInput("Set your 4 number pin");
        if (userPin.length() == 4) {
            System.out.println("Pin created");

        } else {
            System.out.println("should be 4 characters");
            getUserInput("Set your 4 number pin");
        }
    }
    public void enterUserPin() {
        String userPin = getUserInput("Set your 4 number pin");
        if (userPin.length() == 4) {
            System.out.println("Pin correct");

        } else {
            System.out.println("should be 4 characters");
            getUserInput("Set your 4 number pin");
        }
    }
    //initial transaction choice
    public void selectOption() {
        String userInput = getUserInput("Top of the morning, What will you like to do? \n (1) - Create and account \n (2) - Check balance ");
        switch (userInput) {
            case "1":
                selectAccountToCreate();
                break;
            case "2":
                selectAccountToCheck();
                break;
            default:
                System.exit(0);
                throw new IllegalArgumentException("Invalid Input");
        }

    }

    //creating user accounts
    public void selectAccountToCreate() {
        String userInput = getUserInput("Select account to create \n (1) - Checking \n (2) - Savings \n (3) - Business");
        switch (userInput) {
            case "1":
                createCheckingAccount();
                break;
            case "2":
                createSavingsAccount();
                break;
            case "3":
                createBusinessAccount();
                break;
            default:
                throw new IllegalArgumentException("Invalid Input");
        }
        setUserPin();
        selectOption();
    }

    //checking/updating user accounts
    public void selectAccountToCheck() {
        enterUserPin();
        String userInput = getUserInput("Select account to check \n (1) - Checking \n (2) - Savings \n (3)  - Business");
        switch (userInput) {
            case "1":
                checkCheckingAccountBalance();
                break;
            case "2":
                checkSavingsAccountBalance();
                break;
            case "3":
                checkBusinessAccountBalance();
                break;
            default:
                throw new IllegalArgumentException("Invalid Input");
        }
        selectOption();
    }

    public void createCheckingAccount() {
        String firstName = getUserInput("Enter FirstName: ");
        String lastName = getUserInput("Enter LastName: ");
        int accountNumber = Integer.parseInt(getUserInput("Enter last 4 of SSN. please lie: "));
        double startingBalance = Double.parseDouble(getUserInput("Enter Amount of initial deposit: "));
        String accountHolder = firstName + " " + lastName;
        CheckingAccount checkingAccount = new CheckingAccount(accountHolder, accountNumber, startingBalance);
        checkCheckingAccountBalance();
        System.out.println("Checking account created \n Account holder; "+ accountHolder + "." + "\n Account Number: " + accountNumber + "." + "\n Starting balance: "+ startingBalance);

    }

    public void createSavingsAccount() {
        String firstName = getUserInput("Enter FirstName: ");
        String lastName = getUserInput("Enter LastName: ");
        int accountNumber = Integer.parseInt(getUserInput("Enter last 4 of SSN. please lie: "));
        double startingBalance = Double.parseDouble(getUserInput("Enter Amount of initial deposit: "));
        String accountHolder = firstName + " " + lastName;
        SavingsAccount savingsAccount = new SavingsAccount(accountHolder, accountNumber, startingBalance);
        checkSavingsAccountBalance();
        System.out.println("Savings account created \n Account holder; "+ accountHolder + "." + "\n Account Number: " + accountNumber + "." + "\n Starting balance: "+ startingBalance);

    }

    public void createBusinessAccount() {
        String accountHolder = getUserInput("Enter Business Name");
        int accountNumber = Integer.parseInt(getUserInput("Enter last 4 of TIN. please lie: "));
        double startingBalance = Double.parseDouble(getUserInput("Enter Amount of initial deposit: "));
        BusinessAccount businessAccount = new BusinessAccount(accountHolder, accountNumber, startingBalance);
        checkBusinessAccountBalance();
        System.out.println("Business account created \n Account holder; "+ accountHolder + "." + "\n Account Number: " + accountNumber + "." + "\n Starting balance: "+ startingBalance);

    }


    //checking account balances
    public void checkCheckingAccountBalance() {
//        CheckingAccount checkingAccount = new CheckingAccount(getAccountHolder(), num, amount);
        Function<Account, Double> getAccountBalance = Account::getAccountBalance;
        System.out.println(getAccountBalance);
    }

    public void checkSavingsAccountBalance() {
//        SavingsAccount savingsAccount = new SavingsAccount(name, num, amount);
        Function<Account, Double> getAccountBalance = Account::getAccountBalance;
        System.out.println(getAccountBalance);
    }

    public void checkBusinessAccountBalance (){
//        BusinessAccount businessAccount = new BusinessAccount();
        Function<Account, Double> getAccountBalance = Account::getAccountBalance;
        System.out.println(getAccountBalance);
        }
    }

