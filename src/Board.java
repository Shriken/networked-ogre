package NetworkedOgre;

import NetworkedOgre.Tile;

public class Board {

    private static final int NUM_ROWS_ODD = 21;
    private static final int NUM_ROWS_EVEN = 22;
    private static final int NUM_ROWS_MAX = 22;
    private static final int NUM_COLS = 15;

    private Tile[][] tilemap;

    public Board() {
        tilemap = new Tile[NUM_COLS][NUM_ROWS_MAX];
        setAll(Tile.GROUND);
    }

    public int getWidth() {
        return NUM_COLS;
    }

    public int getHeightEven() {
        return NUM_ROWS_EVEN;
    }

    public int getHeightOdd() {
        return NUM_ROWS_ODD;
    }

    public Tile[][] getTilemap() {
        return tilemap;
    }

    public Tile getTile(int x, int y) {
        return tilemap[x][y];
    }

    public void setTile(int x, int y, Tile tile) {
        tilemap[x][y] = tile;
    }

    public void setAll(Tile tile) {
        for (int i = 0; i < NUM_COLS; i++) {
            for (int j = 0; j < NUM_ROWS_MAX; j++) {
                setTile(i, j, tile);
            }
        }
    }

    public void setColumn(int x, Tile tile) {
        int numRows = x % 2 == 0 ? NUM_ROWS_EVEN : NUM_ROWS_ODD;
        for (int i = 0; i < numRows; i++) {
            setTile(x, i, tile);
        }
    }

    public void setRow(int y, Tile tile) {
        for (int i = 0; i < NUM_COLS; i++) {
            setTile(i, y, tile);
        }
    }

    public void setNonexistent() {
        for (int i = 0; i < NUM_COLS; i++) {
            if (i % 2 == 1) {
                setTile(i, NUM_ROWS_MAX, nothing);
            }
        }
    }
}