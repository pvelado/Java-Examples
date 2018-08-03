/*
 * Name: Paulo D. Velado
 * Date: 8/2/18
 * 
 * Desc: Program is an example of how to create a Jframe window. Class constructor 
 * takes in a String and two integer values for object creation.
 * 
 * Usage: User can call getFrame() to call the frame into vuew;
 */
import javax.swing.JFrame;

public class Frame {
	
	private JFrame frame;
	private String title;
	private int width, height;
	
		// Default Constructor
	public Frame() {
		title = "Default Title";
		width = 800;
		height = 600;
		
		setFrameAttributes();
	}
		// Constructor
	public Frame(String t, int w, int h) {
		title = t;
		width = w;
		height = h;
		
		setFrameAttributes();
	}
	
		// Sets other attributes of the JFrame (Called by Constructor)
	private void setFrameAttributes() {
		frame = new JFrame (title);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.pack();
		frame.setResizable(false);
		frame.setSize(width, height);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
		// Returns the set JFrame
	public JFrame getFrame() {
		return frame;
	}
	
}
