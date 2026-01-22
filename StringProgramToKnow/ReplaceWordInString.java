package StringProgramToKnow;

public class ReplaceWordInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "i am going to change job in twenty twenty six";
		
		String change = "remote Job";
		
		String strArr [] = str.split(" ");
		
		String newStr = "";
		
		for(int i=0;i<strArr.length;i++) {
			if(strArr[i].equals("job")) {
				strArr[i]=change;
				newStr=newStr+strArr[i]+" ";
			}else {
				newStr=newStr+strArr[i]+" ";
			}
		}
		
		System.out.println(newStr);

	}

}
