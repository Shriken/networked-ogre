package NetworkedOgre;

import NetworkedOgre.graphics.Render;

public class NetworkedOgre {

    public static Game game;
    public static Render render;

    public static void main(String[] args) {
        game = new Game();
        render = new Render(game);
    }
}
