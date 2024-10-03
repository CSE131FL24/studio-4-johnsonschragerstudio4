package studio4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

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
		System.out.println("starts");
		if (in.next().equals("ellipse")) {
			StdDraw.setPenColor(in.nextInt(), in.nextInt(), in.nextInt());
			System.out.println("color assigned");
			if (in.nextBoolean() == true) {
				System.out.println("tried to draw");
				StdDraw.filledEllipse(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());
			} else {
				System.out.println("tried to draw");
				StdDraw.ellipse(in.nextDouble(),in.nextDouble(), in.nextDouble(), in.nextDouble());

			}
		} 
		
		
	}
}
