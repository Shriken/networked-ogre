package NetworkedOgre;

public class Board {
    // Size of columns 1, 3, 5, ...
    public final int ODD_COLUMN_SIZE;
    // Size of columns 2, 4, 6, ...
    public final int EVEN_COLUMN_SIZE;
    // Number of total columns
    public final int WIDTH;

    private Tile[][] tilemap;

    public Board(int width, int first_col_height) {
		WIDTH = width;
        ODD_COLUMN_SIZE = first_col_height;
        EVEN_COLUMN_SIZE = first_col_height + 1;
        generateTilemap();
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

    public Tile getTile(int x, int y) {
        return tilemap[x][y];
    }

    public void setTile(int x, int y, Tile tile) {
        tilemap[x][y] = tile;
    }

    private void generateTilemap();
        tilemap =  new Tile[WIDTH][];
        for (int i = 0; i < tilemap.lenght; i++) {
            int size = (i % 2 == 0) ? ODD_COLUMN_WIDTH : EVEN_COLUMN_WIDTH;
            tilemap[i] = new Tile[size];
        }
    }

    private void setNothingTiles() {
        for (int i = 0; i < tilemap.length; i++) {
            // On all even indices (odd-numbered columns)
            if (i % 2 == 0) {
                for (int j = 0; j < EVEN_COLUMN_SIZE - ODD_COLUMN_SIZE; j++) {
                    setTile(i, tilemap[i].length - j, new NothingTile());
                }
            }
        }
    }
}
