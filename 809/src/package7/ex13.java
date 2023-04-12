package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class ex13 {

	public static void main(String[] args) {
		Path ip=Paths.get("C:","First.txt");
		System.out.println(ip);
	}

}

