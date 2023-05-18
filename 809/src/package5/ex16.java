package package5;

public class ex16 {
	
	public static void main(String[] args) throws Exception{
		try(DataConverter dc=new DataConverter())// line n2
		{ dc.copyFlatFilesToTables();}

	}
}

class DataConverter implements AutoCloseable{
	public void copyFlatFilesToTables(){}
	public void close() throws Exception{
		throw new RuntimeException();//line n1
	}

}