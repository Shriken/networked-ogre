package NetworkedOgre.tiles;

import java.awt.Color;

import NetworkedOgre.units.Unit;

public class CraterTile extends Tile {
    public CraterTile() {
        super(Color.BLACK);
    }

    public void addUnit(Unit unit) throws NoPutTheUnitInTheCraterException {
        throw new NoPutTheUnitInTheCraterException("no putting the unit in the crater!");
    }
}

class NoPutTheUnitInTheCraterException extends Exception {
    public NoPutTheUnitInTheCraterException(String message) {
        super(message);
    }
}
