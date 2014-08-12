package NetworkedOgre;

import java.awt.Polygon;

public class Hex extends Polygon {

	public Hex(int x, int y, double r) {
		super();

		for (int i = 0; i < 6; i++) {
			addPoint((int) (x + r * Math.cos(Math.PI * 2. / 6. * i)),
			         (int) (y + r * Math.sin(Math.PI * 2. / 6. * i)));
		}
	}
}
