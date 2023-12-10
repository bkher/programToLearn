package InputFromUser;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReader_Practice {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		
		int it = Integer.parseInt(br.readLine());
		System.out.println("Enter String :"+str+" "+it);
		System.out.println("Enter int :"+it);

	}

}
