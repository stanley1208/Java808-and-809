package package7;

import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Properties;

public class ex12 {

	public static void main(String[] args) {
		Path path1=Paths.get("/software/././sys/readme.txt");
		Path path2=path1.normalize();// /software/sys/readme.txt
		Path path3=path2.relativize(path1);
		System.out.println(path1+":"+path1.getNameCount());
		System.out.println(path2+":"+path2.getNameCount());
		System.out.println(path3+":"+path3.getNameCount());

	}

}

