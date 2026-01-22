package MoreKnownOne;

public class ValidatePhoneNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 *  Has the correct number of digits

			Contains only numbers (and allowed symbols like +, -, spaces)

			Follows a country-specific format (if required)
		 */

		String PhoneNumber = "+91 9898016454";
		boolean isValid = true;
		
		String first[] = PhoneNumber.split(" ");
		int lenOfPhone = first[1].length();
		
		if(lenOfPhone!=10) {
			isValid=false;
		}
		
		boolean checkSpecial = PhoneNumber.matches("^[0-9+\\- ]+$");
		
		if(!checkSpecial) {
			isValid=false;
		}
		
		if(isValid) {
			System.out.println("Phone number is valid");
		}else {
			System.out.println("Phone number is not valid");
		}
	
		
		
	}

}
