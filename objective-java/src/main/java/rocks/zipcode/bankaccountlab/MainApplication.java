package rocks.zipcode.bankaccountlab;

import java.util.Scanner;

/**
 * Created by leon on 1/10/18.
 */
public class MainApplication {

    public static void main(String[] args) {
        System.out.println("Here is ATM");
        BankAccount bankAccount = new BankAccount();
//bankAccount.getUserInput("Top of the morning, What will you like to do? \n (1) - Create and account \n (2) - Check balance");
        bankAccount.selectOption();
    }



}



    //welcome to atm message
    //choose you account
    //choose what you want to do (deposit, withdraw or checkbalance err)
    //do action
    // recucle question
    //end task



