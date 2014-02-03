package NetworkedOgre.units;

public class Unit {

    private int x, y;
    private int attack, range, defense;

    public Unit(int x, int y, int attack, int range, int defense) {
        this.x = x;
        this.y = y;
        this.attack = attack;
        this.range = range;
        this.defense = defense;
    }

    public Unit(int x, int y) {
        this(x, y, 0, 0, 0);
    }

    public Unit(int attack, int range, int defense) {
        this(0, 0, attack, range, defense);
    }

    public Unit() {
        this(0, 0);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getAttack() {
        return attack;
    }

    public int getRange() {
        return range;
    }

    public int getDefense() {
        return defense;
    }
}