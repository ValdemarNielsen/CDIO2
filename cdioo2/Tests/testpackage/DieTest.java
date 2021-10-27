package testpackage;

import org.junit.jupiter.api.Test;
import spil.Die;



import static org.junit.jupiter.api.Assertions.*;

class DieTest {
    Die calculator = new Die(6);

    /**
     * En test der tjekker at et roll er inde for den givne sideamount så med værdien sideAmount=80 skal et slag være melle 1 og 80.
     */
    @Test
    void roll() {
        int sideAmount = (int) (Math.random() * 999 + 1);
        calculator.setFaceAmount(sideAmount);
        calculator.roll();
        int roL = calculator.getValue();
        boolean check = (roL >= 1) && (roL <= sideAmount);
        assertTrue(check);


    }

    /**
     * Test der tjekker den største afvigelse i Die tilfældighed denne test fejler hvis deviation er mere end 1%
     */
    @Test
    void dieRollPrabablility() {
        double[] ar = new double[6];
        int rollAmount = 10000000;
        for (int i = 0; i < rollAmount; i++) {
            calculator.roll();

            switch (calculator.getValue()) {
                case 1 -> ar[0]++;
                case 2 -> ar[1]++;
                case 3 -> ar[2]++;
                case 4 -> ar[3]++;
                case 5 -> ar[4]++;
                case 6 -> ar[5]++;
            }
        }
        double dev=getDeviation(ar,rollAmount);
        System.out.println("Maxdeviation= "+dev+"%");
        assertTrue(dev<1);




    }
    public double getDeviation(double[] ar, int roll){
        double maxdev=0;
        roll=roll/6;
        for (double v : ar) {
            double maxdevtst = v / roll;
            if (maxdevtst > 1)
                maxdevtst = maxdevtst - 1;
            else
                maxdevtst = 1 - maxdevtst;
            if (maxdevtst > maxdev)
                maxdev = maxdevtst;
        }




        return maxdev*100;
    }
}