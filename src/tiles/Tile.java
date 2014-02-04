package NetworkedOgre.tiles;

import java.awt.Color;
import java.util.ArrayList;

import NetworkedOgre.units.Unit;

public class Tile {

    protected static final Color BEIGE = new Color(222, 215, 197);

    private Color color;
    private ArrayList<Unit> units;

    public Tile(Color color) {
        this.color = color;
        ArrayList<Unit> units = new ArrayList<Unit>();
    }

    public Tile() {
        this(null);
    }

    public Color getColor() {
        return color;
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public void removeUnit(Unit unit) {
        units.remove(unit);
    }
}