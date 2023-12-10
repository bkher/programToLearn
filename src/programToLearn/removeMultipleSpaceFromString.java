package programToLearn;

public class removeMultipleSpaceFromString {
	
	
	public void method(String str) {		
		System.out.println(str.trim().replaceAll("\\s{2,}", " "));
		
		System.out.println(str.replace(" ", ""));
	}

	
	public  String method2(String s){
	    if(s.length() == 0 ) return "";

	    int timesSpace = 0;
	    String res = "";

	    for (int i = 0; i < s.length(); i++) {
	        char c = s.charAt(i);

	        if(c == ' '){
	            timesSpace++;
	            if(timesSpace < 2)
	                res += c;
	        }else{
	            res += c;
	            timesSpace = 0;
	        }
	    }

	    return res.trim();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		removeMultipleSpaceFromString rms = new removeMultipleSpaceFromString();
		rms.method("kher      bhagat    sinh   ");
		
		System.out.println(rms.method2("kher      bhagat    sinh   "));
	}

}
