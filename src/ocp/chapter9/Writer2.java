package ocp.chapter9;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writer2 {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("test2.txt");
		
		PrintWriter pw = new PrintWriter(f);
		
		pw.close();
	}
}
