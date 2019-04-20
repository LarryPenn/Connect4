
import java.util.*;

public class Connect4 {

	//this two dimensional array stores the discs. 0 indicates no disc, 1 indicates player 1 disc (red), 2 indicates player 2 disc (yellow)

	Board board;
	Player player1;
	Player player2;
	
	//these are the two players
	
	
	public Connect4() {
		board = new Board();
		player1 = new Player();
		player2 = new Player();
		
	}
	
	public void play() {
		
		//Initialize the game and scan player names
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Welcome to Connect 4!");
		System.out.println("Please input player 1 name: ");
		player1.name = scan.next();

		System.out.println("Please input player 2 name: ");
		player2.name = scan.next();
		
		//prompts each player to make a move, as long as there isn't a winner yet, and the board is not full
		
		while(board.findWinner()==0 && board.isBoardFull()==false) {
			player1.makesMove();
			if (board.isBoardFull()==true) {
				System.out.println("Board is full. It is a draw!");
			}
			else if (board.findWinner()==1) {
				System.out.println(player1.name +" wins!");
			}
			else {
				player2.makesMove();
				if (board.findWinner()==2) {
					System.out.println(player2.name +" wins!");
				}
				if (board.isBoardFull()==true) {
					System.out.println("Board is full. It is a draw!");
				}
			}
		}
		
		System.out.println("The game is over. Thanks for playing!");
		
	}
	
	
	
		
}
