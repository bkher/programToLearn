package programToLearn;

public class useSwitchcase {

	public void method1(String str) {
		
		switch (str) {
		case "Monaday": {
			
			System.out.println("1st");
			break;
		}
		case "Tuesday": {
			System.out.println("2nd");
			break;
		}
		case "Wednesday":{
			System.out.println("3rd");
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + str);
		}
	}
	
	
	public void method2() {
		for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 == 0)
                continue;
 
            // If number is odd, print it
            System.out.print(i + " ");
        }
    
	}
	
	public void method3() {
		for (int i = 0; i < 10; i++) {
            // If the number is even
            // skip and continue
            if (i % 2 != 0) {
            	 break;
            }
               
 
            // If number is odd, print it
            System.out.println(i + " ");
        }
    
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		useSwitchcase usc = new useSwitchcase();
		usc.method1("Monaday");
		usc.method2();
		usc.method3();

	}

}
