package ocp.chapter9;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class TestNIO {

	public static void main(String[] args) throws IOException {
		
		Path p = Paths.get("D:\\JavaWorkspace\\Test\\dirr");
		Path p1 = Paths.get("D:\\JavaWorkspace\\Test\\dirr\\file5.txt");
		
		Path p2 = Paths.get("D:", "JavaWorkspace", "Test", "file5.txt");
		
		Path p3 = Paths.get("paths\\file.txt");
		
		Path p4 = Paths.get("file:///D:/JavaWorkspace/Test/file5.txt");
		
		Path p5 = Paths.get("./dirrr/file.txt");
		
		Files.createDirectories(p);
		Files.createFile(p1);
		
		Files.copy(p2, p3, StandardCopyOption.REPLACE_EXISTING);
		
	}
}
