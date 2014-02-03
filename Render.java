import java.awt.Frame;

public class Render {

    Game game;
    Frame frame;

    public Render(Game game) {
        this.game = game;
        frame = new Frame("Ogre");
        frame.setSize(800, 600);
        frame.setVisible(true);
    }
}
