package NetworkedOgre.tiles;

import java.util.ArrayList;

import NetworkedOgre.units.Unit;

public class Tile {

    private ArrayList<Unit> units;

    public Tile() {
        ArrayList<Unit> units = new ArrayList<Unit>();
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