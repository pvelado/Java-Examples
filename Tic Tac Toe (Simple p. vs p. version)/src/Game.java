import java.util.Scanner;

public class Game {
	
	private char player1, player2; // Char that represents each charactor
	private int playerTurn;	// Counter for players turn
	private boolean gameOver; // sets to true when the game has ended
	private GameBoard gb; // creates a gameboard
	private Scanner input;
	
	public Game () {
		player1 = 'X'; // Sets player 1's ID
		player2 = 'O'; // Sets player 2's ID
		playerTurn = 1; // starts on X player
		gameOver = false; 
		gb = new GameBoard();
		input = new Scanner (System.in);
	}
		// launches the Start of the game
	public void launchGame() {
		gameLoop(); // Main Game loop
		System.out.println("Game Over, Thank you for playing!"); // Message prints after game loop
	}
	
		// Main Game loop for tic tac toe game.
	private void gameLoop() {
		
			/*
			 * Game loop Step list:
			 * 
			 * 1. Starting if statment will determin which players turn it is 
			 * 		by seeing if the mod of the players counter divides equally 
			 * 		by 2.
			 * 2. Player will be asked to enter a number from 1-9 which corresponds
			 * 		to a space on the game board.
			 * 3. Player's entry will then be translated into  x, y coordinates.
			 * 4. Coordinantes will be checked to make sure the space on the board
			 * 		is not already taken. Note: if taken, player starts back at 
			 * 		step 2.
			 * 5. Players char ID ( X or Y ) is saved in the game grids array 
			 * 		at the coordinantes translated from players input.
			 * 6. Updated Game Board is printed.
			 * 7. Board is checked for a "3-in-a-row" sequence.
			 * 8. player turn counter increases by 1 and loop starts again.
			 */
		while (gameOver == false) {
			
			int input, transX, transY;
			
				// player X's loop turn
			if(playerTurn%2 != 0) {
				
				input = playerInput(player1);
				transX = translateX(input); 
				transY = translateY(input);
				
				if (gb.checkOpenSpace(transX, transY) == true) {
					gb.setGrid(transX, transY, player1);
					gb.printGameBoard();
					gameOver = gb.checkForWin();
					playerTurn++;
				}
				else {
					gameLoop(); 
				}
			}
			// player 0's loop turn
			else {
				
				input = playerInput(player2);
				transX = translateX(input);
				transY = translateY(input);
					
				if (gb.checkOpenSpace(transX, transY) == true) {
					gb.setGrid(transX, transY, player2);
					gb.printGameBoard();
					gameOver = gb.checkForWin();
					playerTurn++;
				}
				else {
					gameLoop();
				}	
			}
		}
	}
	
		// Method takes in user input returns int
	private int playerInput(char playerID) {
		playerInputMessage(playerID);
		return input.nextInt();
	}
		// Translates the X coordinate from user input returns int 
	private int translateX (int userInput) {
		if (userInput == 1 || userInput == 4 || userInput == 7)
			return 0;
		else if (userInput == 2 || userInput == 5 || userInput == 8)
			return 1;
		else 
			return 2;
	}
		// Translates the Y coordinate from user input returns int
	private int translateY (int userInput ) {
		
		if (userInput == 1 || userInput == 2 || userInput == 3)
			return 0;
		else if (userInput == 4 || userInput == 5 || userInput == 6)
			return 1;
		else 
			return 2;
	}
	
	/*
	 * All Game class Print Messages
	 */
		// Prints player move slect message.
	private void playerInputMessage(char playerID) {
		System.out.printf("Player %C, Please enter your move (number 1-9): ", playerID);
	}
	
}
