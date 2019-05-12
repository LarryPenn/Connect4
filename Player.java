import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {

	// each player has a name

	private String name;
	private int playerNumber;
	private Board board;

	public Player(String name, int num, Board board) {
		this.setName(name);
		this.playerNumber = num;
		this.board = board;
	}

	// player makes a move

	public void makesMove() {

		int column = 0;

		System.out.println(name + ", please indicate which column you'd like to drop the disc");
		Scanner scan = new Scanner(System.in);

		try {
			column = scan.nextInt();
		} catch (InputMismatchException ex) {
			System.out.println("This is not an integer. Please input an integer!");
			scan.nextLine();
			column = scan.nextInt();
		}

		// if move is legal, modify the board to reflect the move; if move is illegal,
		// prompt the user to try again

		while (board.isMoveLegal(column) == false) {
			System.out.println(name + ", the move is illegal, please try again!");
			column = scan.nextInt();
		}

		// if the move is legal, drop the disc to the bottom of the column

		for (int i = 5; i >= 0; i--) {
			if (board.board[i][column - 1] == 0) {
				board.board[i][column - 1] = playerNumber;
				break;
			}
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
