package spil;

public class Output {

    private static String[] spacetext = {
            "You found a chest inside the Tower! You have been rewarded with 250 points",
            "You landed in the Crater, and dropped 100 points on the way",
            "Upon arriving at the Palace Gates, you received 100 points",
            "You're no match for the Cold Desert, and to survive you pay 20 points for shelter",
            "The Walled City rarely gets visitors, and grants you 180 points for your stay",
            "The Monastery is a sacred place, and do not believe in material goods, therefore you neither lose or obtain points",
            "This Black Cave you've entered is no place for a stranger, and you lose 70 points while you're shivering uncontrollably",
            "These old Huts in the mountains are abandoned, you but find a total of 60 points playing around for the taking",
            "The Werewall (werewolf-wall) claims 80 of your points, however in pity for such horrors, you are granted another roll",
            "The pit takes what is wants, and you lose 50 points",
            "You found gold in the mountains and sell it for 650 points. You're rich!"};

    // Returns the spacetext
    public static String[] spacetextGetter(){
        return spacetext;
    }
    public static void playerName(int playerCounter) {
        System.out.println("Enter player " + playerCounter + " name: ");
        playerCounter++;
    }
    public void playerHasWon(){
        System.out.println("Player: "+" has won");
    }
    public static String youRolled(){
        return "you rolled";
    }
    public static void rollTheDie(){
        System.out.println("Roll the die");
    }
    public static String sTurn(){
        return "'s turn";
    }
    public static String newBalance(){
        return " new balance: ";
    }
    public static String anotherturn(){
        return " gets another turn!!!!!";
    }
    public static void playerHasWon(String x){
        System.out.println("Player: "+x+" has won");
    }


    }



