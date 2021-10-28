package spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Bools and counter for keeping track of gamestate
        boolean playerTurn = false;
        boolean gameWon = false;
        int playerCounter = 1;

        Scanner myScanner = new Scanner(System.in);

        // Requests player 1's name
        Output.playerName(playerCounter);
        String Player1Name = myScanner.nextLine();

        playerCounter++;

        // Requests player 2's name
        Output.playerName(playerCounter);
        String Player2Name = myScanner.nextLine();

        // Instantiates objects for our players
        Player myPlayer1 = new Player(Player1Name);
        Player myPlayer2 = new Player(Player2Name);

        // Creates and generates our board
        Board myBoard = new Board();
        myBoard.generateBoard();

        // Creates our rafflecup
        Rafflecup myRafflecup = new Rafflecup(2, 6);

        Output.startGame();

        // Waits for a newline/enter before starting the game
        Scanner nextrne = new Scanner(System.in);
        String next = nextrne.nextLine();

        while (!gameWon) {
            // A player object containing the current player.
            Player currentPlayer;

            // Checks which player to store in our current player object
            if (playerTurn) {
                currentPlayer = myPlayer1;
            } else {
                currentPlayer = myPlayer2;
            }

            System.out.println(currentPlayer.getName() + Output.sTurn());
            playTurn(currentPlayer, myRafflecup, myBoard);

            // Negates the value of the bool to switch turn
            playerTurn = !playerTurn;

            // Checks if somebody has won
            if (myPlayer1.getAccount().getBalance() >= 3000 || myPlayer2.getAccount().getBalance() >= 3000) {
                gameWon = true;

                // Finds out who won and prints
                if (myPlayer1.getAccount().getBalance() >= 3000) {
                    Output.playerHasWon(myPlayer1.getName());
                } else {
                    Output.playerHasWon(myPlayer2.getName());
                }
            }
        }
    }

    // Function handling the game turns
    public static void playTurn(Player currPlayer, Rafflecup myRafflecup, Board myBoard) {
        // Waits for enter before rolling
        Output.rollTheDie();
        Scanner nextrn = new Scanner(System.in);
        String next = nextrn.nextLine();

        // Saves result and prints it
        int result = myRafflecup.sum();
        System.out.print(" " + result);

        // Gets the output, value, and extraturncheck for the result
        String output = myBoard.spaces[result - 2].getOutput();
        int value = myBoard.spaces[result - 2].getValue();
        boolean extraTurnCheck = myBoard.spaces[result - 2].getExtraTurn();

        // Prints the result
        System.out.println("\n" + output);

        // Gets the temporary account from current player and updates the balance
        Account tempAcc = currPlayer.getAccount();
        tempAcc.newBalance(value);

        // Prints player name and their new balance
        System.out.println(currPlayer.getName() + Output.newBalance() + tempAcc.getBalance() + "\n");

        // Checks if the player has an extra turn, if they do, call this function again
        if (extraTurnCheck) {
            System.out.println(currPlayer.getName() + Output.anotherturn());
            playTurn(currPlayer, myRafflecup, myBoard);
        }
    }
}
