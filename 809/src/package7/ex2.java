package package7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ex2 {

	public static void main(String[] args) throws IOException {
		Path path1 = Paths.get("/app/./sys/");
		Path res1 = path1.resolve("log");
		Path path2 = Paths.get("/server/exe/");
		Path res2 = path2.resolve("/readme/");
		System.out.println(res1);
		System.out.println(res2);
	}

}
