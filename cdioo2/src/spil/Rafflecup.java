package spil;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Rafflecup {
    private Die[] cup;

    public Rafflecup(int diceAmount, int faceAmount) {
        Die die1 = new Die(faceAmount);
        this.cup = new Die[diceAmount];
        for (int i = 0; i < diceAmount; i++) {
            this.cup[i] = die1;
        }
    }

    // One setter method when you want to configure your Rafflecup instead of 2
    public void configure(int diceAmount, int faceAmount) {
        Die die1 = new Die(faceAmount);
        this.cup = new Die[diceAmount];
        for (int i = 0; i < diceAmount; i++) {
            this.cup[i] = die1;
        }
    }

    public Die[] getCup() {
        return cup;
    }



    public int sum() {
        int[] values = roll();
        return IntStream.of(values).sum();
    }

    public int[] roll() {
        int[] values = new int[this.cup.length];
        for (int i = 0; i < this.cup.length; i++) {
            cup[i].roll();
            values[i] = cup[i].getValue();

        }
        System.out.print(Output.youRolled() +" "+ Arrays.toString(values));
        return values;


    }



}

