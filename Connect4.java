
import java.util.Scanner;

public class Connect4 {

	// this two dimensional array stores the discs. 0 indicates no disc, 1 indicates
	// player 1 disc (red), 2 indicates player 2 disc (yellow)

	Board board;
	Player player1;
	Player player2;

	// these are the two players

	public Connect4() {
		board = new Board();
		player1 = new Player("player 1", 1, board);
		player2 = new Player("player 2", 2, board);

	}

	public void play() {

		// Initialize the game and scan player names
		Scanner scan = new Scanner(System.in);

		System.out.println("Welcome to Connect 4!");
		System.out.println("Please input player 1 name: ");
		player1.setName(scan.next());

		System.out.println("Please input player 2 name: ");
		player2.setName(scan.next());

		// prompts each player to make a move, as long as there isn't a winner yet, and
		// the board is not full

		while (board.findWinner() == 0 && board.isBoardFull() == false) {
			player1.makesMove();
			board.printBoard();
			if (board.findWinner() == 1) {
				System.out.println(player1.getName() + " wins!");
			} else if (board.isBoardFull() == true) {
				System.out.println("Board is full. It is a draw!");
			} else {
				player2.makesMove();
				board.printBoard();
				if (board.findWinner() == 2) {
					System.out.println(player2.getName() + " wins!");
				}
				else if (board.isBoardFull() == true) {
					System.out.println("Board is full. It is a draw!");
				}
			}
		}

		System.out.println("The game is over. Thanks for playing!");

	}

}
