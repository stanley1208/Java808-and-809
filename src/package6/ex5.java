package package6;




import java.io.Console;




public class ex5 {

	public static void main(String[] args){
		Console console=System.console();
		char[] pass=console.readPassword("Enter password:");
		String password=new String(pass);
	}

}
