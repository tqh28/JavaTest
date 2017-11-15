package ocp.chapter9;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;

public class CreateDirectory {
	
	public static void main(String[] args) throws IOException {
		File dir = new File("testDir4");
		dir.mkdir();
		
		File f = new File("testFile5.txt");
		BufferedWriter bw = new BufferedWriter(new FileWriter(f));
		bw.write("Line 1");
		bw.newLine();
		bw.write("Line 2");
		bw.flush();
		bw.close();
		
		f.renameTo(new File("file5.txt"));
		
		dir.renameTo(new File("dir4"));
		
		Path p = dir.toPath();
		
		
		
//		PrintWriter pw = new PrintWriter(f);
//		pw.print("Line 1");
//		pw.println("Line 2");
//		pw.print(" T.T");
//		pw.flush();
//		pw.close();
		
//		BufferedReader br = new BufferedReader(new FileReader(f));
	}
}
