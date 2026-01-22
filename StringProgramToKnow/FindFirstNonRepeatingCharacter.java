package StringProgramToKnow;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

String str = "i am going to change job in twenty twenty six";
		
		char [] strchar = str.toCharArray();
		int count =0;
		
		for(int i=0;i<strchar.length;) {
			count=0;
			for(int j=i+1;j<strchar.length;j++) {
				if(strchar[i]==strchar[j]) {
					count++;
				}
			}
			if(count==0 && strchar[i]!=' ') {
				System.out.println(strchar[i]);
				break;
			}else {
				i++;
			}
		}
	}

}
