package spil;

import java.util.Arrays;

public class Testting {
    public static void main(String[] args) {
        Rafflecup cup=new Rafflecup(2,6);
        System.out.println(cup.sum());
        System.out.println(Arrays.toString(cup.diceValues()));
        cup.configure(3,6);
        System.out.println(cup.sum());
        System.out.println(Arrays.toString(cup.diceValues()));



    }

}
