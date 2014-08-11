package NetworkedOgre;

public class Board  {
    // Size of columns 1, 3, 5, ...
    private static final int ODD_COLUMN_SIZE = 21;
    // Size of columns 2, 4, 6, ...
    private static final int EVEN_COLUMN_SIZE = 20;
    // Number of total columns
    private static final int WIDTH = 15;

    private Tile[][] tilemap;

    public Board() {
        tilemap = new Tile[WIDTH][ODD_COLUMN_SIZE];
        reset();
    }

    public void reset() {
        for (int i = 0; i < tilemap.length; i++) {
            for (int j = 0; j < tilemap[0].length; j++) {
                setTile(i, j, new ClearTile());
            }
        }

        setNothingTiles();
    }

    public void setTile(int x, int y, Tile tile) {
        tilemap[x][y] = tile;
    }

    private void setNothingTiles() {
        for (int i = 0; i < tilemap.length; i++) {
            // On all odd indices (even-numbered columns)
            if (i % 2 != 0) {
                for (int j = 0; j < ODD_COLUMN_SIZE - EVEN_COLUMN_SIZE; j++) {
                    setTile(i, tilemap[i].length - j, new NothingTile());
                }
            }
        }
    }
}