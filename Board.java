
public class Board {

	int[][] board = new int[6][7];

	// this method checks if there is a winner, and if so, return who the winner is

	public int findWinner() {

		// 0 indicates no winner; 1 indicates player 1 wins; 2 indicates player 2 wins

		int winner = 0;

		// check if 4 discs align horizontally

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] == 1 && board[i][j + 1] == 1 && board[i][j + 2] == 1 && board[i][j + 3] == 1) {
					winner = 1;
				} else if (board[i][j] == 2 && board[i][j + 1] == 2 && board[i][j + 2] == 2 && board[i][j + 3] == 2) {
					winner = 2;
				}
			}
		}

		// check if 4 discs align vertically

		for (int j = 0; j < 7; j++) {
			for (int i = 0; i < 3; i++) {
				if (board[i][j] == 1 && board[i + 1][j] == 1 && board[i + 2][j] == 1 && board[i + 3][j] == 1) {
					winner = 1;
				} else if (board[i][j] == 2 && board[i + 1][j] == 2 && board[i + 2][j] == 2 && board[i + 3][j] == 2) {
					winner = 2;
				}
			}
		}

		// check if 4 discs align diagonally from top left to bottom right

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] == 1 && board[i + 1][j + 1] == 1 && board[i + 2][j + 2] == 1
						&& board[i + 3][j + 3] == 1) {
					winner = 1;
				} else if (board[i][j] == 2 && board[i + 1][j + 1] == 2 && board[i + 2][j + 2] == 2
						&& board[i + 3][j + 3] == 2) {
					winner = 2;
				}
			}
		}

		// check if 4 discs align diagonally from top right to bottom left

		for (int i = 3; i < 6; i++) {
			for (int j = 0; j < 4; j++) {
				if (board[i][j] == 1 && board[i - 1][j + 1] == 1 && board[i - 2][j + 2] == 1
						&& board[i - 3][j + 3] == 1) {
					winner = 1;
				} else if (board[i][j] == 2 && board[i - 1][j + 1] == 2 && board[i - 2][j + 2] == 2
						&& board[i - 3][j + 3] == 2) {
					winner = 2;
				}
			}
		}

		return winner;

	}

	// This method checks if the board is full

	public boolean isBoardFull() {

		boolean full = true;

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if (board[i][j] == 0) {
					full = false;
				}
			}
		}
		return full;
	}

	// checks if a move is legal. Returns TRUE if yes, FALSE if no

	public boolean isMoveLegal(int col) {

		boolean legal = true;

		// Out of bound input is illegal

		if (col > 7 || col < 1) {
			legal = false;
		}

		// if there's still empty spot in the board in that column, then the move is legal

		else if (board[0][col-1] != 0) {
			legal = false;
		}

		return legal;

	}
	
	// print out the board after player makes the move

	public void printBoard() {
		System.out.println("The current board is as follows:");

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				if(board[i][j]==0) {
					System.out.print(" ");
				}
				else {
					System.out.print(board[i][j]);
				}
			}
			System.out.println("");
		}
	}

	public int[][] getBoard() {
		return board;
	}

	public void setBoard(int[][] board) {
		this.board = board;
	}

}
