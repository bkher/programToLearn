package MoreKnownOne;

public class SplitLogLines {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String logs =
		        "INFO App started\n" +
		        "WARN Low memory\n" +
		        "ERROR Null pointer exception";
		
		String lines[] = logs.split("\\r?\\n");
		
		for(String line: lines) {
			System.out.println(line);
		}
	}

}
