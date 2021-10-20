package spil;

import java.util.stream.IntStream;

public class Rafflecup {
    private int diceAmount;
    private Die[] cup;

    public Rafflecup(int diceAmount, int faceAmount) {
        Die die1 = new Die(faceAmount);
        this.cup = new Die[diceAmount];
        for (int i = 0; i < diceAmount; i++) {
            this.cup[i] = die1;
        }
    }
    public void configure(int diceAmount, int faceAmount){
        Die die1 = new Die(faceAmount);
        this.cup = new Die[diceAmount];
        for (int i = 0; i < diceAmount; i++) {
            this.cup[i] = die1;
        }

    }

    public Die[] getCup() {
        return cup;
    }
    public int getDiceAmount(){
        return diceAmount;
    }

    private void roll() {
        for (int i = 0; i < cup.length; i++) {
            cup[i].roll();
        }
    }

    public int sum() {
        int[] values = diceValues();
        int sum = IntStream.of(values).sum();
        return sum;
    }

    public int[] diceValues() {
        int[] values = new int[this.cup.length];
        for (int i = 0; i < this.cup.length; i++) {
            cup[i].roll();
            values[i] = cup[i].getValue();

        }
        return values;


    }


}

