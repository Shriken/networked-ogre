package NetworkedOgre;

import java.util.ArrayList;
import java.awt.Frame;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Color;
import java.awt.image.BufferStrategy;

import NetworkedOgre.units.Unit;
import NetworkedOgre.tiles.Tile;

public class Renderer {

	private static final int WIDTH = 480;
	private static final int HEIGHT = 760;
	private static final double TILE_RADIUS = 19;

	private Game game;
	private Frame frame;
	private RenderCanvas screen;

	public Renderer(Game game) {
		this.game = game;
		screen = new RenderCanvas(WIDTH, HEIGHT);

		// initialize the frame
		frame = new Frame("Networked Ogre");
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
				drawTile(i, j, g);
			}
		}

		bs.show();
		g.dispose();
	}

	// draw a single tile from the board and everything on it
	private void drawTile(int x, int y, Graphics g) {
		Tile t = game.board.getTile(x, y);

		double r = TILE_RADIUS;
		double hr = r * Math.sqrt(3); // the "height radius", or height of a half hex

		// the coordinates of the center of the hex
		int cx = (int) (2*r + x * 1.5 * r);
		int cy = (int) (2*r + (y + ((x+1) % 2) / 2.) * Math.sqrt(3) * r);
		Hex hex = new Hex(cx, cy, r);

		// fill and draw the outline
		g.setColor(t.color);
		g.fillPolygon(hex);
		g.setColor(Color.BLACK);
		g.drawPolygon(hex);

		ArrayList<Unit> units = t.getUnits();
		for (int i = 0; i < units.size(); i++) {
			drawUnit(units.get(i), g);
		}
	}

	// draw a single unit
	private void drawUnit(Unit u, Graphics g) {}
}
