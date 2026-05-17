import java.util.Scanner;
class InvalidUsernameException extends Exception{
	public InvalidUsernameException(String msg) {
		super(msg);
	}
}

class InvalidPasswordException extends Exception{
	public InvalidPasswordException(String msg) {
		super(msg);
	}
}

class Login{
	String Username = "admin";
	String password = "12345";
	
	public void validateUsername(String enteredUsername) throws InvalidUsernameException{
		if(!Username.equals(enteredUsername)) {
			throw new InvalidUsernameException("invalid username");
		}
	}
	
	public void validatePassword(String enteredPassword) throws InvalidPasswordException {
		if(!password.equals(enteredPassword)) {
			throw new InvalidPasswordException ("invalid password");
		}
	}
}
public class LoginTest {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Login l =new Login();
	System.out.println("enter username:");
	String usname = sc.nextLine();
	
	try {
		l.validateUsername(usname);
		int attempts = 3;
		
		while(attempts > 0) {
			System.out.println("enter password");
			String pass=sc.nextLine();
			
			try {
				l.validatePassword(pass);
				System.out.println("login successful");
			
			break;
		}
			catch(InvalidPasswordException e) {
				attempts--;
				System.out.println(e.getMessage());
				if(attempts > 0) {
					System.out.println("remaining attempts" + attempts);
				}
				else {
					System.out.println("acc locked");
				}
			}
	    }
	}
	catch (InvalidUsernameException e) {

        System.out.println(e.getMessage() );
    }
	sc.close();
}


}
