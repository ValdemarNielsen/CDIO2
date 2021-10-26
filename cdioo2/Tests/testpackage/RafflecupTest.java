package testpackage;

import org.junit.jupiter.api.Test;
import spil.Die;
import spil.Rafflecup;

import static org.junit.jupiter.api.Assertions.*;

class RafflecupTest {
    Rafflecup calculator=new Rafflecup(2,6);

    /**
     * En test der tjekker om faceamount og sideamount passer med random input.
     */
    @Test
    void configure() {
        int diceAmount = (int) (Math.random() * 999 + 1);
        int sideAmount = (int) (Math.random() * 999 + 1);
        int randomDice = (int) (Math.random() * diceAmount);
        calculator.configure(diceAmount, sideAmount);
        Die[] newDieArr = calculator.getCup();
        assertEquals(diceAmount, newDieArr.length, 0);
        assertEquals(sideAmount, newDieArr[randomDice].getFaceAmount(), 0);


    }

    /**
     * Tjekker om en sum er som forventet, Giver fail hvis ikke.
     */
    @Test
    void sum() {
        int diceAmount = (int) (Math.random() * 999 + 1);
        int sideAmount = (int) (Math.random() * 999 + 1);
        calculator.configure(diceAmount,sideAmount);
        int sum=calculator.sum();
        boolean check= sum >= diceAmount && sum <= diceAmount * sideAmount;
        assertTrue(check);

    }
}