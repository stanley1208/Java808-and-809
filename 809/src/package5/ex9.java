package package5;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class ex9 {

	public void doRegister(String name, int age) throws UserException, AgeOutOfLimitException {
        if (name.length() < 6) {
            throw new UserException();
        } else if (age >= 60) {
            throw new AgeOutOfLimitException();
        } else {
            System.out.println("User is registered.");
        }
    }
 
    public static void main(String[] args) throws UserException {
        ex9 t = new ex9();
        t.doRegister("Mathew", 60);
    }

}

class UserException extends Exception{
	
}

class AgeOutOfLimitException extends UserException{
	
}


