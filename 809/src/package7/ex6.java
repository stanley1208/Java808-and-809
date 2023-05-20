package package7;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

public class ex6 {

	public static void main(String[] args) throws IOException {
		new ex6().recDelete("C:/Users/user/Documents/abc");
	}

	public void recDelete(String dirName) throws IOException{
		File[] listOfFiles = new File(dirName).listFiles();
	    if (listOfFiles != null && listOfFiles.length > 0) {
	        for (File aFile : listOfFiles) {
	            if (aFile.isDirectory()) {
	                recDelete(aFile.getAbsolutePath());
	            } else if (aFile.getName().endsWith(".class")) {
	                aFile.delete();
	            }
	        }
	    }
	}
}
