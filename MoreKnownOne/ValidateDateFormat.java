package MoreKnownOne;

public class ValidateDateFormat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String date = "29-02-2001";

		boolean isValid = false;

		String dateArr[] = date.split("-");

		int day = Integer.parseInt(dateArr[0]);
		int month = Integer.parseInt(dateArr[1]);
		int year = Integer.parseInt(dateArr[2]);
		

		if (year % 4 != 0) {

			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day >= 1 && day <= 31) {
					isValid = true;
				} else {
					isValid = false;
				}
			}

			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day >= 1 && day <= 30) {
					isValid = true;
				} else {
					isValid = false;
				}
			}

			if (month == 2) {
				if (day >= 1 && day <= 28) {
					isValid = true;
				} else {
					isValid = false;
				}
			}

		} else {
			
			if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
				if (day >= 1 && day <= 31) {
					isValid = true;
				} else {
					isValid = false;
				}
			}

			if (month == 4 || month == 6 || month == 9 || month == 11) {
				if (day >= 1 && day <= 30) {
					isValid = true;
				} else {
					isValid = false;
				}
			}
			
			if (month == 2) {
				if (day >= 1 && day <= 29) {
					isValid = true;
				} else {
					isValid = false;
				}
			}
		}

		if (isValid) {
			System.out.println("date format and validation is correct");
		} else {
			System.out.println("date format and validation is not correct");
		}
		
	}

}
