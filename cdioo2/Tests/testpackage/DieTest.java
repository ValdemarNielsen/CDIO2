package testpackage;

import org.junit.jupiter.api.Test;
import spil.Die;

import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    Die calculator= new Die(6);

    /**
     * En test der tjekker at et roll er inde for den givne sideamount så med værdien sideAmount=80 skal et slag være melle 1 og 80.
     */
    @Test
     void roll() {
        int sideAmount = (int) (Math.random() * 999 + 1);
        calculator.setFaceAmount(sideAmount);
        calculator.roll();
        int roL= calculator.getValue();
        boolean check= (roL >= 1) && (roL <= sideAmount);
        assertTrue(check);


    }
}