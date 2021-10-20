package spil;

public class Board {

    Space[] spaces = new Space[11];
    int[] spaceValues = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    String[] spaceText = Output.spacetextGetter();

    public void generateBoard(){
        for(int i = 0; i < 11; i++){
            if(i == 8){
                spaces[i] = new Space(spaceValues[i], spaceText[i], true);
            }
            else{
                spaces[i] = new Space(spaceValues[i], spaceText[i], false);
            }
        }
    }

    public Space[] spaceGetter(){
        return spaces;
    }
}

class Space{

    int value;
    String output;
    boolean extraTurn;

    Space(int valuePass, String outputPass, boolean extraTurnPass){
        this.value = valuePass;
        this.output = outputPass;
        this.extraTurn = extraTurnPass;
    }

    public int getValue() {
        return value;
    }

    public boolean getExtraTurn() {
        return extraTurn;
    }

    public String getOutput() {
        return output;
    }
}