package package5;

public class ex15 {
	
	public static void main(String[] args){
		Resource res1=new Resource();
		try {
			res1.open();
			res1.close();
		}catch(Exception e) {
			System.out.println("Exception -1");
		}
		
		
		try (Resource res2=new Resource();){
			res1.open();
			
		}catch(Exception e) {
			System.out.println("Exception -2");
		}
	}
}



class Resource implements AutoCloseable{

	@Override
	public void close() throws Exception {
		System.out.println("Close-");
		
	}
	
	public void open() {
		System.out.println("Open-");
	}
	
}