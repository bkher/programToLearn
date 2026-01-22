package MoreKnownOne;

import java.util.Arrays;

public class ValidateEmailFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1= "test@gmail.com";
			
		boolean isValidEmail = true;

        String[] first = s1.split("@");
        if (first.length != 2) {
            isValidEmail = false;
        } else {

    
            boolean check1 = first[0].matches("[A-Za-z0-9+_.-]+");

       
            String[] second = first[1].split("\\.");

            if (second.length != 2) {
                isValidEmail = false;
            } else {

                boolean check2 = second[0].matches("[A-Za-z0-9.-]+");

                boolean check3 = second[1].matches("[A-Za-z]{2,}");

          
                isValidEmail = check1 && check2 && check3;
            }
        }

        System.out.println("Email valid? " + isValidEmail);
		

	}

}
