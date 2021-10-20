package spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        boolean playerTurn = false;

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
        int result = myRafflecup.sum();

        String outputTest = myBoard.spaces[result - 2].getOutput();
        int valueTest = myBoard.spaces[result - 2].getValue();

        Account tempAcc = myPlayer1.getAccount();
        int balTest = tempAcc.getBalance();

        System.out.println(balTest);
        tempAcc.newBalance(valueTest);
        balTest = tempAcc.getBalance();
        System.out.println(balTest);

        System.out.println(outputTest);
    }
}
