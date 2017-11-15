package ocp.chapter9;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Writer1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		File file = new File("test1.txt");
		System.out.println(file.exists());
		
		FileWriter fw = new FileWriter(file);
		fw.write("TTT");
		fw.write("QQQ");
		fw.write("HHH");
		
		fw.flush();
		fw.close();
		
		FileReader fr = new FileReader(file);
		char[] in = new char[20];
		System.out.println(fr.read());
		System.out.println(fr.read(in));
		
		fr.close();
		file.createNewFile();
		
		file.deleteOnExit();
		
		System.out.println(file.exists());
	}

}
