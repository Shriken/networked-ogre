package NetworkedOgre;

import javax.swing.JFrame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferStrategy;

public class Renderer {

	private static final int WIDTH = 480;
	private static final int HEIGHT = 760;

	private Game game;
	private JFrame frame;
	private RenderCanvas screen;

	public Renderer(Game game) {
		this.game = game;
		screen = new RenderCanvas(WIDTH, HEIGHT);

		// initialize the frame
		frame = new JFrame("Networked Ogre");
		frame.add(screen);
		frame.pack();
		frame.setVisible(true);

		screen.createBufferStrategy(2);
	}

	// render the board to the frame and display it
	public void render() {
		Board board = game.board;
		BufferStrategy bs = screen.getBufferStrategy();
		Graphics g = bs.getDrawGraphics();

		// render each tile
		for (int i = 0; i < board.WIDTH; i++) {
			for (int j = 0; j < ((i % 2 == 0) ? board.ODD_COLUMN_SIZE :
			                                    board.EVEN_COLUMN_SIZE); j++) {
				Tile t = board.getTile(i, j);
				if (t instanceof NothingTile) continue; // skip NothingTiles

				g.setColor(t.color);
				double r = 19;
				double hr = r * Math.sqrt(3);
				int x = (int) (2*r + i * 1.5 * r);
				int y = (int) (2*r + (j + ((i+1) % 2) / 2.) * Math.sqrt(3) * r);
				Hex hex = new Hex(x, y, r);
				g.fillPolygon(hex);
				g.setColor(Color.BLACK);
				g.drawPolygon(hex);
			}
		}

		bs.show();
		g.dispose();
	}
}
