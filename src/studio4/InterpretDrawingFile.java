package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.awt.Color;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		int red = in.nextInt();
		int green = in.nextInt();
		int blue = in.nextInt();
		Boolean bool = in.nextBoolean();
		double a = in.nextDouble();
		double b = in.nextDouble();
		double c = in.nextDouble();
		double d = in.nextDouble();
		
		Color color = new Color(red, green, blue);
		StdDraw.setPenColor(color);
		StdDraw.filledRectangle(a, b, c, d);
		
		
	}
}
