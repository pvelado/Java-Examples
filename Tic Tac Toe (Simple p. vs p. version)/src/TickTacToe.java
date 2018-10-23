/*
 * Name: Paulo D. Velado
 * Date: 10/22/18
 * 
 * Desc: Program simulates a simple tic tac toe game. 
 * This version only allows Two human players to play each other.
 * Players take turns entering a number from 1-9 which corrispond 
 * to spaces on the a game board until a player gets "3-in-a-row"
 * and wins or the players draw by filling the game board completly 
 * without either getting a "3-in-a-row" sequence.
 *  
 */
public class TickTacToe {

	public static void main(String[] args) {
	
		Game main_game = new Game(); // initializes game class
		
		main_game.launchGame(); // launches game
	}

}
