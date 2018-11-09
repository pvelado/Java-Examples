package tictactoe.game.gui;

import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class GamePanel extends JPanel {
	
	private JButton [] gridButtons;
	private int turnAlternate;
	
	public GamePanel() {
		turnAlternate = 0;
		setPanelAttributes(); // call game panel attributes
		initializeButtons();  // calls button initialization
	}
		
	private void setPanelAttributes() {
		new JPanel(); // Creates JPanel
		setLayout(new GridLayout(3,3)); // sets the buttons into a grid
	}
		// 
	private void initializeButtons() {
		gridButtons = new JButton[9]; // initializes the jButton Array
		
			// loop sets all the buttons on the panel
		for (int i = 0; i <= 8; i ++) {
			gridButtons[i] = new JButton(); // creates all the buttons in the array
			gridButtons[i].setText(""); // sets all button texts
			gridButtons[i].addActionListener(new GridListener());
			
			add(gridButtons[i]); // adds the grid buttons to the panel
			
		}
	}
		// Resets the buttons on the grid
	private void resetButtons() {
		for(int i = 0; i <= 8; i++) {
			gridButtons[i].setText("");
		}
	}
		
	private class GridListener implements ActionListener{
		
		public void actionPerformed(ActionEvent e) {
			
			JButton buttonClicked = (JButton)e.getSource(); //get the particular button that was clicked
			buttonClicked.setFont(new Font("Comic Sans MS", Font.BOLD, 60)); // sets the text attributes of the buttons
			
				/*
				 * Main Game Loop:
				 * 
				 */
			if(turnAlternate%2 == 0 && buttonClicked.getText() == "") {
				buttonClicked.setForeground(Color.BLUE);// sets X text to blue
				buttonClicked.setText("X"); // sets X text
			}
			else if (buttonClicked.getText() == ""){
				buttonClicked.setForeground(Color.RED); // sets O text to Red
				buttonClicked.setText("O"); // sets O txt
			}
			else // If the button already selected is choosen the turn will not change
				turnAlternate--;
							
				// check for winner, if true prints play again massage 
			if (checkForWin() == true) {
				char winningPlayer; 
					// checks the currnet turn and saves a char of the winning player
				if (turnAlternate%2 == 0)
					winningPlayer = 'X';
				else 
					winningPlayer = 'O';
					
				int dialogResult = JOptionPane.showConfirmDialog(null, "Player " + winningPlayer + " is the winner! "
						+ "Would you like to play again?");
				if (dialogResult == JOptionPane.YES_OPTION)
					resetButtons(); // if yes is selected buttons are reset
				else
					System.exit(0); // if no or cancel is selected program ends
			}
				// check for draw, if true prints play again massage
			if (checkForDraw() == true) {
				int dialogResult = JOptionPane.showConfirmDialog(null, "Game is a Draw. Would you like to play again?");
				if (dialogResult == JOptionPane.YES_OPTION)
					resetButtons();
				else
					System.exit(0);
				
			}
			
			turnAlternate++; // changes the players turn 
		}
			// checks the text of all the button array's indexes to see if there are still open spaces.
		private boolean checkForDraw() {
			
			int openSpaces = 0;
			for(int i = 0; i <= 8;i++) {
				if (gridButtons[i].getText() == "")
					openSpaces++;	
			}
				// if none of the indexs are found to have "" as the button text, return true for draw
			if (openSpaces == 0)
				return true;
			else
				return false;
		}
			// checks the board to see if their is a sequence of three matching adjacent texts.
		private boolean checkForWin() {
			/**
			 * Reference: button array arrangment on board
			 * 
			 * 		0 | 1 | 2
			 * 		3 | 4 | 5
			 * 		6 | 7 | 8
			 */
				// Horizantal check
			if (checkAdjacent(1,0) && checkAdjacent(1,2))
				return true;
			else if(checkAdjacent(3,4) && checkAdjacent(4,5))
				return true;
			else if(checkAdjacent(6,7) && checkAdjacent(7,8))
				return true;
			
				// Vertical check
			else if (checkAdjacent(0,3) && checkAdjacent(3,6))
				return true;
			else if (checkAdjacent(1,4) && checkAdjacent(4,7))
				return true;
			else if (checkAdjacent(2,5) && checkAdjacent(5,8))
				return true;
				
				// Diagnal Check
			else if (checkAdjacent(0,4) && checkAdjacent(4,8))
				return true;
			else if (checkAdjacent(2,4) && checkAdjacent(4,6))
				return true;
			else
				return false;
		}
		
		
			// method checks for matching text on the buttons from two indexs of the button array
		private boolean checkAdjacent(int a , int b) {
			if (gridButtons[a].getText().equals(gridButtons[b].getText()) && !gridButtons[a].getText().equals(""))
				return true;
			else
				return false;
		}
	}
}
