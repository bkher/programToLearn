package programToLearn;

public class GetLuckyNumberFromTheArray {
	
	static int counter =2;
	
	public static boolean method1(int listOfNumber) {
		
		if (counter > listOfNumber) {
			System.out.println(counter+" "+listOfNumber);
            return true;
		}
            
        if (listOfNumber % counter == 0) {
        	System.out.println(counter+" "+listOfNumber);
            return false;
        }
        
        int next_position = listOfNumber - (listOfNumber / counter);
        System.out.println(next_position);
        
        counter++;
        return method1(next_position);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 19;
		 
        // Function call
        if (method1(x))
            System.out.println(x + " is a lucky no.");
        else
            System.out.println(x + " is not a lucky no.");
    }
	}


