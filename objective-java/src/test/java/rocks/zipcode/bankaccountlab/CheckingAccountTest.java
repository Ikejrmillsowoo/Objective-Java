package rocks.zipcode.bankaccountlab;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class CheckingAccountTest {
 ;
    // bankAccount
    CheckingAccount checkingAccount = new CheckingAccount("Isaac", 1, 500.0);
    //Check withdrawals
    @Test
    public void getAccountBalanceTest1(){
        //CheckingAccount checkingAccount = new CheckingAccount("Isaac", 1, 500.0);
        //Given
        double expectedBalance = 500.0;

        //When
        double actualBalance = checkingAccount.getAccountBalance();

        //Then
        Assert.assertEquals(actualBalance, expectedBalance, 0.03);// use assert delta because doubles are unpredictable with their decimal

    }

    //Witdrawal test
    @Test
    public void withdrawTest1(){
        checkingAccount.withdrawal(50.00);
        //Given
        double expectedBalance = 450.0;

        //When
        double actualBalance = checkingAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }

    //Check negative withdrawals
    @Test
    public void negativeWithdrawTest1(){
        //checkingAccount.withdrawal(100.0);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            checkingAccount.withdrawal(550.0);
        });

        String expectedMessage = "Withdrawal amount can not be less than current balance";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(500.0, checkingAccount.getAccountBalance(), 0.003);
    }

    //Check deposits
    @Test
    public void depositTest1(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            checkingAccount.withdrawal(-50.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(500.0, checkingAccount.getAccountBalance(), 0.003);
    }

    //check negative deposits
    @Test
    public void depositTest2(){
        checkingAccount.deposit(50.00);
        //Given
        double expectedBalance = 550.0;

        //When
        double actualBalance = checkingAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }


    @Test
    public void negativeDepositTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            checkingAccount.deposit(-50.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(500.0, checkingAccount.getAccountBalance(), 0.003);
    }
}
