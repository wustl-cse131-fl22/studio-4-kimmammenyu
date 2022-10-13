package studio4;

import java.awt.Color;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		StdDraw.setPenColor(Color.BLUE);
		StdDraw.filledRectangle(0.5, 0.5, .5, .3);
		
		StdDraw.setPenColor(Color.WHITE);
		StdDraw.filledRectangle(0.5, 0.5, .167, .3);
		
		StdDraw.setPenColor(Color.RED);
		StdDraw.filledRectangle(0.833, 0.5, .167, .3);
	}
}