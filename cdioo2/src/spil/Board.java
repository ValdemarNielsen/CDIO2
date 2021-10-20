package spil;

public class Board {

    Space[] spaces = new Space[11];
    int[] spaceValues = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};

    String[] spaceText = Output.spacetextGetter();

    public void generateBoard(){
        for(int i = 0; i < 11; i++){
            spaces[i] = new Space(spaceValues[i], spaceText[i]);
        }
    }

    public Space[] spaceGetter(){
        return spaces;
    }
}

class Space{

    int value;
    String output;

    Space(int valuePass, String outputPass){
        this.value = valuePass;
        this.output = outputPass;
    }

    public int getValue() {
        return value;
    }

    public String getOutput() {
        return output;
    }
}