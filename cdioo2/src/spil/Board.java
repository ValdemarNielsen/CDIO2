package spil;

public class Board {

    // Creates an array of our space objects, an int array for the values, and an array of the output texts
    Space[] spaces = new Space[11];
    final int[] spaceValues = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};
    private String[] spaceText = Output.spacetextGetter();

    // Generates the board and passes all the variables to the specific spaces
    public void generateBoard(){
        for(int i = 0; i < spaces.length; i++){
            if(i == 8){
                spaces[i] = new Space(spaceValues[i], spaceText[i], true);
            }
            else{
                spaces[i] = new Space(spaceValues[i], spaceText[i], false);
            }
        }
    }

    public int[] getSpaceValues() {
        return spaceValues;
    }

    public Space[] spaceGetter(){
        return spaces;
    }
}

class Space{

    private int value;
    private String output;
    private boolean extraTurn;

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