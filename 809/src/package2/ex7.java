package package2;

public class ex7 {

	DBConfiguration configureDB(String uname,String password) {
		return new DBConfiguration();
	}
	
	public static void main(String[] args) {
		ex7 r=new ex7();
		DBConfiguration dbConf=r.configureDB("manager","manager");
	}

}

class DBConfiguration{
	String user;
	String password;
}


