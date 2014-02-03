package NetworkedOgre;

import NetworkedOgre.Unit;

public class Tile {

    private int type;
    private ArrayList<Unit> units;

    public Tile(int type) {
        this.type = type;
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