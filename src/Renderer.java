package NetworkedOgre;

import javax.swing.JFrame;
import java.awt.Dimension;

public class Renderer {

	private static final int WIDTH = 640;
	private static final int HEIGHT = 480;

	private Game game;
	private JFrame frame;

	public Renderer(Game game) {
		game = game;

		// initialize the frame
		frame = new JFrame("Networked Ogre");
		frame.setMinimumSize(new Dimension(640, 480));
		frame.setMaximumSize(new Dimension(640, 480));
		frame.pack();
		frame.setVisible(true);
	}

	// render the board to the frame and display it
	public void render() {
		
	}
}
