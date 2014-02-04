package NetworkedOgre.graphics;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferStrategy;
import javax.swing.JFrame;
import NetworkedOgre.Game;

public class Render {

    Game game;
    JFrame frame;
    RenderCanvas screen;

    public Render(Game game) {
        this.game = game;
        frame = new JFrame("Ogre");
        screen = new RenderCanvas();

        frame.add(screen);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        screen.createBufferStrategy(2);
    }

    public void render() {
        BufferStrategy bs = screen.getBufferStrategy();
        Graphics2D g = (Graphics2D) bs.getDrawGraphics();
        g.setColor(Color.RED);
        g.fillRect(0, 0, 50, 50);
        g.dispose();
        bs.show();
    }
}
