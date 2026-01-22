package MoreKnownOne;

public class MaskSensitiveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Mask sensitive data (card number)
		
		
		String Input=  "1234-5678-9012-3456";
		
		int isValidDigit =4;
		
		int maskLengh =  Input.length()-isValidDigit;
		
		String masked = Input.substring(0,maskLengh).replaceAll("[0-9]", "X");
		
		System.out.println(masked+Input.substring(maskLengh));

	}

}
