
public class App5 {
	public static class App {
		 public static void main(String[] args) throws LogFileException { 
			 App obj =new App();
		 try{
		 obj.open();
		 obj.process();
		 //insert code here
		 }
		 catch(Exception e){
		 System.out.println("Completed.");
		 }
		 }
		 public void process() throws LogFileException{
		 System.out.println("Processed");
		 throw new LogFileException();
		 }
		 public void open() {
		 System.out.println("Opened.");
		 throw new AccessViolationException();
		 }
		 }
}
