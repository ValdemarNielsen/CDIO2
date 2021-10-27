package testpackage;

import org.junit.jupiter.api.Test;
import spil.Board;
import spil.Rafflecup;

import static org.junit.jupiter.api.Assertions.*;

public class DemandedTests {
    Rafflecup test = new Rafflecup(2, 6);
    Board myBoard = new Board();

    /**
     * Her ses en test der vurdere om man nogensinde kommer 1000 under ens max vi kan teste med 100000,
     * på omkring 1 sekund.
     */
    @Test
    void accNeverReachBelow0() {
        myBoard.generateBoard();
        boolean check = true;
        int sum = 1000;
        int max = sum;
        for (int i = 0; i < 100000; i++) {
            sum += myBoard.getSpaceValues()[test.sum()-2];
            if (sum < max)
                max = sum;
            if (sum < max - 1000)
                check = false;


        }
        assertTrue(check);

    }


}

