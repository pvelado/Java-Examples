package tictactoe.game;



import tictactoe.game.gui.Frame;
import tictactoe.game.gui.GamePanel;


public class MainGame {


	public static void main(String[] args) {
		Frame frame = new Frame(); // Frame
		GamePanel game = new GamePanel();//Game Panel
		frame.LaunchFrame(); // launches frame
		frame.getContentPane().add(game); // adds GamePanel to frame
		
		

		
	}

}
