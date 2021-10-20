package spil;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter player 1 name: ");
        String Player1 = myScanner.nextLine();

        System.out.println("Enter player 2 name: ");
        String Player2 = myScanner.nextLine();

        Player myPlayer1 = new Player(Player1);




        Board myBoard = new Board();

        myBoard.generateBoard();

        Rafflecup myRafflecup = new Rafflecup(2, 6);
        int result = myRafflecup.sum();

        String outputTest = myBoard.spaces[result].getOutput();
        int valueTest = myBoard.spaces[result].getValue();

        System.out.println(outputTest);
    }
}
