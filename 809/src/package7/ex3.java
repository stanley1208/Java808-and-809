package package7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex3 {

	public static void main(String[] args) throws IOException {
		Path p1=Paths.get("/Pics/MyPic.jpeg");
		System.out.println(p1.getNameCount()
		        + ":" + p1.getName(1)
		        + ":" + p1.getFileName());		
	}

}
