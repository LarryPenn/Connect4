import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {

	@Test
	void testIsBoardFull() {
		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				b1.board[i][j] = 1;
			}
		}

		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				b2.board[i][j] = 1;
			}
			b2.board[i][6] = 0;
		}

		assertEquals(b1.isBoardFull(), true);
		assertEquals(b2.isBoardFull(), false);
		assertEquals(b3.isBoardFull(), false);

	}

	@Test
	void testFindWinner() {

		Board b1 = new Board();
		Board b2 = new Board();
		Board b3 = new Board();
		Board b4 = new Board();
		Board b5 = new Board();

		for (int i = 0; i < 4; i++) {
			b1.board[i][0] = 1;
		}

		for (int j = 3; j < 7; j++) {
			b2.board[1][j] = 2;
		}

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				b3.board[i][j] = 1;
			}
		}
		
		for (int i = 0; i < 4; i++) {
			for (int j = 6; j >2; j--) {
				b4.board[i][j] = 2;
			}
		}

		assertEquals(b1.findWinner(), 1);
		assertEquals(b2.findWinner(), 2);
		assertEquals(b3.findWinner(), 1);
		assertEquals(b4.findWinner(), 2);
		assertEquals(b5.findWinner(), 0);
	}
	
	@Test
	void testIsMoveLegal() {
		
		Board b1 = new Board();
		Board b2 = new Board();
		
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 6; j++) {
				b1.board[i][j] = 1;
			}
			b1.board[i][6] = 0;
		}
		
		assertEquals(b1.isMoveLegal(3), false);
		assertEquals(b1.isMoveLegal(4), false);
		assertEquals(b1.isMoveLegal(7), true);
		assertEquals(b1.isMoveLegal(8), false);
		
		assertEquals(b2.isMoveLegal(-1), false);
		assertEquals(b2.isMoveLegal(4), true);
		assertEquals(b2.isMoveLegal(7), true);
		assertEquals(b2.isMoveLegal(8), false);
		
		
	}

}
