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

	public static final int WIDTH = 500;
	public static final int HEIGHT = 800;
	public static final int TILE_RADIUS = 20;
	public static final int OFFSET_H = TILE_RADIUS * 2;
	public static final int OFFSET_V = TILE_RADIUS * 2;

	// the height of half a hex
	public static final double HEIGHT_RADIUS = TILE_RADIUS * Math.sqrt(3) / 2;

	private Game game;
	private Frame frame;
	private RenderCanvas screen;
	private UIHandler uihandler;

	public Renderer(Game game) {
		this.game = game;
		screen = new RenderCanvas(WIDTH, HEIGHT);

		// initialize the frame
		frame = new Frame("Networked Ogre");
		frame.add(screen);
		frame.pack();
		frame.setVisible(true);

		screen.createBufferStrategy(2);

		uihandler = new UIHandler(game);
		screen.addMouseListener(uihandler);
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
		double hr = HEIGHT_RADIUS;

		// the coordinates of the center of the hex
		int cx = OFFSET_H + (int) (x * 1.5 * r);
		int cy = OFFSET_V + (int) ((2 * y + ((x+1) % 2)) * hr);
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
