package rocks.zipcode.bankaccountlab;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class BusinessAccountTest {
    BusinessAccount businessAccount = new BusinessAccount("Joe", 2, 1000.0);
    //Check withdrawals
    @Test
    public void getAccountBalanceTest1(){
        //CheckingAccount checkingAccount = new CheckingAccount("Isaac", 1, 500.0);
        //Given
        double expectedBalance = 1000.0;

        //When
        double actualBalance = businessAccount.getAccountBalance();

        //Then
        assertEquals(actualBalance, expectedBalance, 0.03);// use assert delta because doubles are unpredictable with their decimal

    }

    //Witdrawal test
    @Test
    public void withdrawTest1(){
        businessAccount.withdrawal(400.00);
        //Given
        double expectedBalance =600.0;

        //When
        double actualBalance = businessAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }

    //Check negative withdrawals
    @Test
    public void negativeWithdrawTest1(){
        //checkingAccount.withdrawal(100.0);

        Exception exception = assertThrows(IllegalStateException.class, () -> {
            businessAccount.withdrawal(1550.0);
        });

        String expectedMessage = "Withdrawal amount can not be less than current balance";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(1000.0, businessAccount.getAccountBalance(), 0.003);
    }

    //Check deposits
    @Test
    public void depositTest1(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            businessAccount.withdrawal(-500.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(1000.0, businessAccount.getAccountBalance(), 0.003);
    }

    //check negative deposits
    @Test
    public void depositTest2(){
        businessAccount.deposit(500.00);
        //Given
        double expectedBalance = 1500.0;

        //When
        double actualBalance = businessAccount.getAccountBalance();

        //Then
        assertEquals(expectedBalance, actualBalance, 0.003);
    }


    @Test
    public void negativeDepositTest(){
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            businessAccount.deposit(-50.0);
        });

        String expectedMessage = "Sorry amount can not be 0 or negative";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));
        assertEquals(1000.0, businessAccount.getAccountBalance(), 0.003);
    }
}
