package package5;

public class ex16 {
	
	public static void main(String[] args)throws Exception{
		try (DataConveter dc=new DataConveter();){
			dc.copyFlatFilesToTables();
		}
	}
}

class DataConveter implements AutoCloseable{
	public void copyFlatFilesToTables() {
		
	}
	public void close() throws Exception{
		throw new RuntimeException();
	}
}
