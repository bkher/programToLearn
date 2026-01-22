package arrayProgramToKnow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ChunkArrayIntoParts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
        int chunkSize = 3;
        
        List<int[]> result =  new ArrayList<int[]>();
      
        
        for(int i=0;i<arr.length;i+=chunkSize) {
        	int end = Math.min(arr.length, i + chunkSize);
        	System.out.println("end is :--  "+end);
        	
        	int []chunk = new int[end-i];
        	
        	for(int j=i;j<end;j++) {
        		chunk[j-i]=arr[j];
        	}
        	result.add(chunk);
        	
        }
        
       for(int[]c:result) {
    	   System.out.println(Arrays.toString(c));
       }

	}

}
