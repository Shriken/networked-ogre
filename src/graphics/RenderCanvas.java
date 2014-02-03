package NetworkedOgre.graphics;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.image.BufferStrategy;

public class RenderCanvas extends Canvas {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public RenderCanvas() {
        Dimension size = new Dimension(WIDTH, HEIGHT);
        setSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
    }
}
