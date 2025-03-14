package rocks.zipcode.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class SavingsAccountTest {
    SavingsAccount savingsAccount = new SavingsAccount("Kobe", 3, 2500.0);
    //Check withdrawals
    @Test
    public void getAccountBalanceTest1(){
        //CheckingAccount checkingAccount = new CheckingAccount("Isaac", 1, 500.0);
        //Given
        double expectedBalance = 2500.0;

        //When
        double actualBalance = savingsAccount.getAccountBalance();

        //Then
        assertEquals(actualBalance, expectedBalance, 0.03);// use assert delta because doubles are unpredictable with their decimal

    }

    //Witdrawal test
    @Test
    public void withdrawTest1(){
        savingsAccount.withdrawal(500.00);
        //Given
        double expectedBalance = 2000.0;

        //When
        double actualBalance = savingsAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }

    //Check negative withdrawals
    @Test
    public void negativeWithdrawTest1(){
        //checkingAccount.withdrawal(100.0);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            savingsAccount.withdrawal(2750.0);
        });

        String expectedMessage = "Withdrawal amount can not be less than current balance";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(2500.0, savingsAccount.getAccountBalance(), 0.003);
    }

    //Check deposits
    @Test
    public void depositTest1(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.withdrawal(-500.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(2500.0, savingsAccount.getAccountBalance(), 0.003);
    }

    //check negative deposits
    @Test
    public void depositTest2(){
        savingsAccount.deposit(5000.00);
        //Given
        double expectedBalance = 7500.0;

        //When
        double actualBalance = savingsAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }


    @Test
    public void negativeDepositTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            savingsAccount.deposit(-500.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(2500, savingsAccount.getAccountBalance(), 0.003);
    }
}
