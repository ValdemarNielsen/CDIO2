package spil;

public class Board {

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
