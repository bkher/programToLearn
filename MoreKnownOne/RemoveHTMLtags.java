package MoreKnownOne;

public class RemoveHTMLtags {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 ="<p>Hello <b>World</b>! <a href=\"#\">Click here</a></p>\n";
		
		String plainText =  s1.replaceAll("<[^>]*>", "");
		
		System.out.println(plainText);
		

	}

}
