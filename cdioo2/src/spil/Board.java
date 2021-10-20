package spil;

public class Board {
    public static void values(String[] args) {
        int[] spaces;
        spaces = new int[12];
        int[] spacevalues = {250, -100, 100, -20, 180, 0, -70, 60, -80, -50, 650};


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

    public void setValue(int value) {
        this.value = value;
    }

    public String getOutput() {
        return output;
    }

    public void setOutput(String output) {
        this.output = output;
    }
}