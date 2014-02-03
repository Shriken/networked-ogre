package NetworkedOgre;

import javax.swing.JFrame;

public class Render {

    Game game;
    JFrame frame;
    RenderComponent screen;

    public Render(Game game) {
        this.game = game;
        frame = new JFrame("Ogre");
        screen = new RenderComponent();
        frame.add(screen);
        frame.pack();
        frame.setResizable(false);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
