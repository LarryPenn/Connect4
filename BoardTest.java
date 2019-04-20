import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class BoardTest {


	@Test
	void testIsBoardFull() {
		Board b1 = new Board();
		Board b2 = new Board();
		
		for (int i = 0; i<6; i++) {
			for (int j = 0; j<7; j++) {
				b1.board[i][j]=1;
			}
		}
		
		for (int i = 0; i<6; i++) {
			for (int j = 0; j<6; j++) {
				b2.board[i][j]=1;
			}
			b2.board[i][6]=0;
		}
		
		assertEquals(b1.isBoardFull(),true);
		assertEquals(b2.isBoardFull(),false);
		
	}
	

}
