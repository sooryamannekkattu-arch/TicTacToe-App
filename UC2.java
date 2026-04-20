import java.util.Random;

public class TicTacToe {

    static char player1Symbol;
    static char player2Symbol;
    static int currentPlayer;

    public static void main(String[] args) {
        toss();
        displayResult();
    }

    static void toss() {
        Random rand = new Random();
        int result = rand.nextInt(2);

        if (result == 0) {
            currentPlayer = 1;
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            currentPlayer = 2;
            player2Symbol = 'X';
            player1Symbol = 'O';
        }
    }

    static void displayResult() {
        System.out.println("Player " + currentPlayer + " starts");
        System.out.println("Player 1: " + player1Symbol);
        System.out.println("Player 2: " + player2Symbol);
    }
}
