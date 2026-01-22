package arrayProgramToKnow;

public class FindMajorityElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[] = {12,13,32,112,33,53,72,42,72,23,35,38};
		
		int majorityCount = arr.length/2;
		boolean found = false;
		
		
		for(int i=0;i<arr.length;i++) {
			int count=1;
			boolean alreadyCounted = false;
			
			for (int k = 0; k < i; k++) {
                if (arr[k] == arr[i]) {
                    alreadyCounted = true;
                    break;
                }
            }
			if (alreadyCounted) {
				continue;
			}
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			
			if(count>=majorityCount) {
				System.out.println(arr[i]+" is appread "+count+" Times");
				found = true;
				break;
			}
		}
		
		if (!found) {
            System.out.println("No Majority Element found");
        }
		

	}

}
