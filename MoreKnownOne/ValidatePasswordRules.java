package MoreKnownOne;

public class ValidatePasswordRules {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String pass = "PAss1234$";
		
		boolean isValid =  pass.matches("^(?=...*[A-Z])^(?=.*[a-z])(?=.*[0-9]).{8,}$");
		
		if(isValid) {
			System.out.println("Password is valid: ");
		}else {
			System.out.println("Password is not valid: ");
		}
		

	}

}
