package NetworkedOgre.tiles;

import java.awt.Color;
import java.util.ArrayList;

import NetworkedOgre.units.Unit;

public class Tile {
    public Color color;
    public ArrayList<Unit> units;

    public Tile(Color color) {
        this.color = color;
        this.units = new ArrayList<Unit>();
    }

    public void addUnit(Unit unit) {
        units.add(unit);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }
}
