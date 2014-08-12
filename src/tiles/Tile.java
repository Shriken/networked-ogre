package NetworkedOgre.tiles;

import java.awt.Color;
import java.util.ArrayList;

import NetworkedOgre.units.Unit;

public class Tile {
    public Color color;
    public boolean[] ridges;
    public ArrayList<Unit> units;

    public Tile(Color color) {
        this.color = color;
        this.ridges = new boolean[6];
        this.units = new ArrayList<Unit>();
    }

    public void addUnit(Unit unit) throws NoPutTheUnitInTheCraterException {
        units.add(unit);
    }

    public ArrayList<Unit> getUnits() {
        return units;
    }

    /* Ridges of a tile are represented by an array of length 6.
     * Indices represent the ridge in a clockwise direction, with 0 being the
     * top-most ridge.
     */
    public boolean getRidge(int position) {
        return ridges[position];
    }

    public void addRidge(int position) {
        ridges[position] = true;
    }

    public void removeRidge(int position) {
        ridges[position] = false;
    }
}
