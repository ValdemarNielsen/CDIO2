package spil;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playerTurn = false;
        boolean gameWon = false;

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter player 1 name: ");
        String Player1 = myScanner.nextLine();

        System.out.println("Enter player 2 name: ");
        String Player2 = myScanner.nextLine();

        Player myPlayer1 = new Player(Player1);
        Player myPlayer2 = new Player(Player2);

        Board myBoard = new Board();

        myBoard.generateBoard();
        Rafflecup myRafflecup = new Rafflecup(2, 6);

        while(!gameWon){
            Player currentPlayer = myPlayer1;

            if(playerTurn){
                currentPlayer = myPlayer1;
            }
            else{
                currentPlayer = myPlayer2;
            }

            System.out.println(currentPlayer.getName() + "'s turn");

            playTurn(currentPlayer, myRafflecup, myBoard);

            playerTurn = !playerTurn;

            if(myPlayer1.getAccount().getBalance() >= 3000 || myPlayer2.getAccount().getBalance() >= 3000){
                gameWon = true;

                if(myPlayer1.getAccount().getBalance() >= 3000){
                    myPlayer1.playerHasWon();
                }
                else{
                    myPlayer2.playerHasWon();
                }
            }
        }
    }

    public static void playTurn(Player currPlayer, Rafflecup myRafflecup, Board myBoard){
        System.out.println("Roll the die");
        int result = myRafflecup.sum();

        String output = myBoard.spaces[result - 2].getOutput();
        int value = myBoard.spaces[result - 2].getValue();
        boolean extraTurnCheck = myBoard.spaces[result - 2].getExtraTurn();

        Account tempAcc = currPlayer.getAccount();
        tempAcc.newBalance(value);

        System.out.println(currPlayer.getName() + " new balance: " + tempAcc.getBalance());

        if(extraTurnCheck){
            System.out.println(currPlayer.getName() + " gets another turn!!!!!");
            playTurn(currPlayer, myRafflecup, myBoard);
        }
    }

}
