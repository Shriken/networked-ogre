package NetworkedOgre;

import java.awt.Canvas;
import java.awt.Dimension;

public class RenderCanvas extends Canvas {

	public RenderCanvas(int width, int height) {
		Dimension size = new Dimension(width, height);
		setSize(size);
		setPreferredSize(size);
		setMinimumSize(size);
		setMaximumSize(size);
	}
}
