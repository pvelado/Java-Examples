
public class GameBoard {

	private char gameGrid[][];
	
	public GameBoard() {
		gameGrid = new char [3][3]; // initializes the size of the game board to a 3 x 3 index size.
		resetGameGrid();  // sets all of the indexs after initializing the class
		printGameBoard(); // Prints Initial gameboard after initializing the class
	}
	
	
	    //Sets all the Array index to a Space (' ')
	private void resetGameGrid() {
		for (int y = 0; y <= 2; y++) {
			for (int x = 0; x <= 2;x++) {
				gameGrid [x][y] = ' ';
			}
		}
	}
	
		// Sets an X or an O in a specified index
	public void setGrid(int x, int y, char playerID) {
		gameGrid [x][y] = playerID;
	}
	
		// Checks that a specific index doesn't already have an X or an O.
	public boolean checkOpenSpace(int x, int y) {
		if (gameGrid[x][y] == ' ') {
			return true;
		}
		else {
			closedSpaceMessage();
			return false;
		}
	}
	
	
	/*
	 * Method checks the game board to see if there are three matching charactors 
	 * in the rows, columnes, or diagnally. All iterations check to see that a
	 * space (' ') is not present to insure that a false/positive win doesn't
	 * occur.
	 */
	public boolean checkForWin() {
		
			// loop that checks all columnes
		for (int row = 0; row < gameGrid.length;row++ ) {
			if (gameGrid[row][0] == gameGrid[row][1] && gameGrid[row][1] == gameGrid[row][2] && gameGrid [row][0] != ' ') {
				return true;
			}
		}
			// loop that checks all rows
		for (int col = 0; col < gameGrid.length; col++) {
			if (gameGrid [0][col] == gameGrid[1][col] && gameGrid[1][col] == gameGrid[2][col] && gameGrid [0][col] != ' ') {
				return true;
			}
		}
			// loop checks crosses
		if (gameGrid[0][0] == gameGrid[1][1] && gameGrid[1][1] == gameGrid[2][2] && gameGrid[0][0] != ' ') 
			return true;
		
		if (gameGrid[2][0] == gameGrid[1][1] && gameGrid[1][1] == gameGrid [0][2] && gameGrid[2][0] != ' ' )
			return true;
		
			// checks for draw
		if(gameGrid[0][0] != ' ' && gameGrid[0][1] != ' ' && gameGrid[0][2] != ' ' && 
				gameGrid[1][0] != ' ' && gameGrid[1][1] != ' ' && gameGrid[1][2] != ' ' &&
				gameGrid[2][0] != ' ' && gameGrid[2][1] != ' ' && gameGrid[2][2] != ' ') {
			return true;
		}
		return false;
	}
	
	/*
	 * All Game Board class Print Methods
	 */
		// Prints Message that space choosen is already taken
	private void closedSpaceMessage() {
		System.out.println("The space you selected is taken please enter anouther Number (1-9)");
	}
	
		// Prints game board contents
	public void printGameBoard() {
		System.out.printf("\n   %C | %C | %C %15d | 2 | 3 \n", gameGrid [0][0], gameGrid [1][0], gameGrid [2][0],1);
		System.out.println("  -----------             -----------");
		System.out.printf("   %C | %C | %C %15d | 5 | 6 \n", gameGrid [0][1], gameGrid [1][1], gameGrid [2][1],4);
		System.out.println("  -----------             -----------");
		System.out.printf("   %C | %C | %C %15d | 8 | 9 \n\n", gameGrid [0][2], gameGrid [1][2], gameGrid [2][2],7);
		
	}
	
}
