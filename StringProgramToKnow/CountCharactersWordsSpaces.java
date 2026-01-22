package StringProgramToKnow;

public class CountCharactersWordsSpaces {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "I am going to find remote job in twenty twenty six";
		
		int count=1;
		
		char strChar[]=str.toCharArray();
		
		for(int i=0;i<strChar.length;i++) {
			count=1;
			for(int j=i+1;j<strChar.length;j++) {
				if(strChar[i]==strChar[j]) {
					count++;
					strChar[j]='0';
				}
			}
			if(strChar[i]!='0') {
				System.out.println(strChar[i]+" is occured: "+count+" times");
			}
		}
		
		System.out.println("-----------------------------------------------------------");
		
		String strArray[]= str.split(" ");
		
		for(int i=0;i<strArray.length;i++) {
			count=1;
			for(int j=i+1;j<strArray.length;j++) {
				if(strArray[i].equals(strArray[j])) {
					count++;
					strArray[j]="000";
				}
			}
			if(strArray[i]!="000") {
				System.out.println(strArray[i]+" is occured: "+count+" times");
			}
		}
		
		

	}

}
