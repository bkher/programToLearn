package programToLearn;

public class CheckCharacterOccurance {
	
	public void method1(String str) {
		
		char [] strCharArray = str.toCharArray();
		int lengthOfArray = strCharArray.length;
		int count;
		
		for(int i=0;i<lengthOfArray;i++) {
			count =0;
			for(int j=0;j<lengthOfArray;j++) {
				if(strCharArray[i]==strCharArray[j]) {
					count+=1;
					
					if(count>1)
					strCharArray[j]='0';
				}
			}
			if(strCharArray[i]!= ' ' && strCharArray[i]!='0') {
			System.out.println(strCharArray[i]+" : "+count);
			}
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CheckCharacterOccurance cco = new CheckCharacterOccurance();
		cco.method1("my name is bhagatsinh kher");
	}

}
