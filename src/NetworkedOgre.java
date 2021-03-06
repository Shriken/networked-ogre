package NetworkedOgre;

import NetworkedOgre.Renderer;
import NetworkedOgre.Game;

public class NetworkedOgre {

    public static final int FRAMERATE = 60;

    public static Game game;
    public static Renderer renderer;
    public static boolean running;

    public static void main(String[] args) {
        game = new Game();
        renderer = new Renderer(game);

        running = true;
        float framelength = 1000.0f / FRAMERATE;
        float prvFrameLen = 1000f;
        while (running) {
            // limit framerate
            if (prvFrameLen < framelength) {
                try {
                    Thread.sleep((int)(framelength - prvFrameLen));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }

            float start = System.currentTimeMillis();
            // run game logic and rendering
            game.tick();
            renderer.render();
            // end game logic and rendering
            float end = System.currentTimeMillis();
            prvFrameLen = end - start;
        }
    }
}
