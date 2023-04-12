package package5;



public class ex8 {

	public static void main(String[] args) throws Exception{
		try(ImageScanner ir=new ImageScanner();
				ImagePrinter iw=new ImagePrinter();) {
			ir.scanImage();
			iw.printImage();
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}

class ImageScanner implements AutoCloseable{
	
	public void close() throws Exception{
		System.out.println("Scanner closed. ");
	}
	
	public void scanImage() throws Exception{
		System.out.println("Scan");
		throw new Exception("Unable to scan. ");
	}
}

class ImagePrinter implements AutoCloseable{
	
	public void close() throws Exception{
		System.out.println("Printer closed. ");
	}
	
	public void printImage() {
		System.out.println("Print. ");
	}
}



