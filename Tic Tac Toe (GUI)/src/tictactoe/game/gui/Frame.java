package tictactoe.game.gui;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class Frame extends JFrame{

	private String frameTitle; // frame Title
	
		// Constructor
	public Frame () {
		frameTitle = "Tic Tac Toe"; // Sets Frame Title Variable
		new JFrame(); // Crates Jframe
	}
	
		// Launches the JFrame
	public void  LaunchFrame() {
		frameAttributes(); // Calls frame Attributes
	}
	
		// Contains all frame attributes
	private void frameAttributes () {
		setSize(500, 500); // size of frame
		setTitle(frameTitle); // sets frame title
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close operation
		setLocationRelativeTo(null); // frame opens in the center of the screen 
		setVisible(true); // make frame to visable 
	}

}
