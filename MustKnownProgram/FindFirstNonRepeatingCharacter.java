package MustKnownProgram;

public class FindFirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "i will change job in twenty twenty six";
		char [] strchar = str.toCharArray();
		
		String newstr = "";
		int count =1;
		
		for(int i=0;i<strchar.length-1;i++) {
			count=1;
			for(int j=i+1;j<strchar.length;j++) {
				if(strchar[i]==strchar[j]) {
					count++;
					strchar[j]='0';
				}
			}
			if(count==1 && strchar[i]!='0') {
				newstr = newstr+strchar[i];
				break;
			}
		}
		
		System.out.println(newstr);
		

	}

}
