package MoreKnownOne;

public class FindURLsInText {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String text = "Visit https://example.com and http://test.org for details.";
		
		String [] wordArr =  text.split("\\s+");
		
		for(String word: wordArr) {
			if(word.startsWith("https://") || word.startsWith("http://")) {
				System.out.println(word);
			}
		}
			}

}
