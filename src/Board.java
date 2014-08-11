package NetworkedOgre;

public class Board  {
    // Size of columns 1, 3, 5, ...
    private static final ODD_COLUMN_SIZE = 21;
    // Size of columns 2, 4, 6, ...
    private static final EVEN_COLUMN_SIZE = 20;
    // Number of total columns
    private static final WIDTH = 15;

    private Tile[][] tilemap;

    public Board() {
        tilemap = new Tile[WIDTH][ODD_COLUMN_SIZE];
        reset();
    }

    public void reset() {
        for (int i = 0; i < tilemap.length, i++) {
            for (int j = 0; j < tilemap[0].length, j++) {
                setTile(i, j, new ClearTile());
            }
        }
    }

    public void setTile(Tile tile) {
        tilemap[i][j] = tile;
    }
}