package NetworkedOgre.graphics;

import java.awt.Component;
import java.awt.Dimension;

public class RenderComponent extends Component {

    public static final int WIDTH = 800;
    public static final int HEIGHT = 600;

    public RenderComponent() {
        Dimension size = new Dimension(WIDTH, HEIGHT);
        setSize(size);
        setPreferredSize(size);
        setMinimumSize(size);
        setMaximumSize(size);
    }
}
