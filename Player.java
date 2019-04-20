import java.util.Scanner;

public class Player {
	
	//each player has a name
	
	String name;
	
	
	// player makes a move
	
	public void makesMove() {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println(name + ", please indicate which column you'd like to drop the disc");
		int column = scan.nextInt();
		
		//if move is legal, modify the board to reflect the move; if move is illegal, prompt the user to try again
		
		
		
	}
	
	// checks if a move is legal. Returns TRUE if yes, FALSE if no
	
	public boolean isMoveLegal() {
		
		//if there's still empty spot in the board in that column, then the move is legal. Out of bound input is illegal
		
		
		return false;
		
	}
	
	// 
}
