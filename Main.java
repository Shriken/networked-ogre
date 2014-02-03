public class Main {

    public static Game game;
    public static Render render;

    public static void main(String[] args) {
        game = new Game();
        render = new Render(game);
    }
}
