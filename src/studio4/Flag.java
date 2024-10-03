package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		StdDraw.setPenColor(205, 0, 0);
		StdDraw.filledRectangle(0.5, 0.5, 0.4, 0.25);
		StdDraw.setPenColor(255,215,0);
		double[] x = {0.2+0.08, 0.1+0.08, 0.14+0.08, 0.095+0.08, 0.08+0.08, 0.085+0.08, 0.089+0.08, 0.19+0.08};
		double[] y = {0.7-0.1, 0.8-0.1, 0.83-0.1, 0.84-0.1, 0.78-0.1, 0.75-0.1, 0.78-0.1, 0.69-0.1};
		StdDraw.filledPolygon(x, y);
	}
}