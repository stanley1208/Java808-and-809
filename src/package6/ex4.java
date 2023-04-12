package package6;

import static org.hamcrest.CoreMatchers.nullValue;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.text.AbstractDocument.BranchElement;

public class ex4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br=new BufferedReader(new FileReader("C:/Users/user/Documents/data.txt"));
		BufferedWriter bw=new BufferedWriter(new FileWriter("C:/Users/user/Documents/alldata.txt"));
		String line=null;
		while((line=br.readLine())!=null) {
			bw.append(line+"\n");
		}
		bw.flush();
	}

}
