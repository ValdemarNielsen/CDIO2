package spil;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        boolean playerTurn = false;
        boolean gameWon = false;
        int playerCounter = 1;

        Scanner myScanner = new Scanner(System.in);
        Output.playerName(playerCounter);
        playerCounter++;
        String Player1 = myScanner.nextLine();
        Output.playerName(playerCounter);
        String Player2 = myScanner.nextLine();

        Player myPlayer1 = new Player(Player1);
        Player myPlayer2 = new Player(Player2);

        Board myBoard = new Board();

        myBoard.generateBoard();
        Rafflecup myRafflecup = new Rafflecup(2, 6);
        Output.startGame();
        Scanner nextrne = new Scanner(System.in);
        String next = nextrne.nextLine();

        while (!gameWon) {


            Player currentPlayer;


            if (playerTurn) {
                currentPlayer = myPlayer1;
            } else {
                currentPlayer = myPlayer2;
            }

            System.out.println(currentPlayer.getName() + Output.sTurn());

            playTurn(currentPlayer, myRafflecup, myBoard);

            playerTurn = !playerTurn;

            if (myPlayer1.getAccount().getBalance() >= 3000 || myPlayer2.getAccount().getBalance() >= 3000) {
                gameWon = true;

                if (myPlayer1.getAccount().getBalance() >= 3000) {
                    Output.playerHasWon(myPlayer1.getName());
                } else {
                    Output.playerHasWon(myPlayer2.getName());
                }
            }
        }
    }

    public static void playTurn(Player currPlayer, Rafflecup myRafflecup, Board myBoard) {
        Scanner nextrn = new Scanner(System.in);
        Output.rollTheDie();

        String next = nextrn.nextLine();
        int result = myRafflecup.sum();
        System.out.print(" " + result);
        String output = myBoard.spaces[result - 2].getOutput();
        System.out.println();
        System.out.println(output);
        int value = myBoard.spaces[result - 2].getValue();
        boolean extraTurnCheck = myBoard.spaces[result - 2].getExtraTurn();

        Account tempAcc = currPlayer.getAccount();
        tempAcc.newBalance(value);

        System.out.println(currPlayer.getName() + Output.newBalance() + tempAcc.getBalance());
        System.out.println();


        if (extraTurnCheck) {
            System.out.println(currPlayer.getName() + Output.anotherturn());
            playTurn(currPlayer, myRafflecup, myBoard);
        }
    }


}
