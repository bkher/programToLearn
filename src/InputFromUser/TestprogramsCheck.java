package InputFromUser;

public class TestprogramsCheck {

	
	private String name;
	
	public static void add(int a) {
	
		int add = a+a;
		System.out.println(add);
	}
	
	public static void add(int a,int b) {
		int add = a+b;
		System.out.println(add);
	}
	
	private void sub(int a) {
		
		int sub = a-a;
		System.out.println(sub);
	}

	private void sub(int a,int b) {
	
		int sub = a-b;
		System.out.println(sub);
	}
	
	
	public String getName() {
		return name;
	}



	public void setName(String name) {
		
		if (name.length()>10) {
			this.name = name;
		}
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(10<12?"true":"False");
		
		String s = "Sachin";
		s.concat(" Batsman");
		System.out.println(s);
		
		StringBuffer s1 = new StringBuffer("Sachin");
		s1.append(" Tandulakar");
		System.out.println(s1);
		
		String s2 = "Learn Share Learn";
		 int output = s2.indexOf("n",3);
		 System.out.println(output);
		 
		 TestprogramsCheck ptc = new TestprogramsCheck();
		 ptc.setName("Bhagatsinh kher");
		 System.out.println(ptc.getName());
		 
		 
		 TestprogramsCheck tpc = new TestprogramsCheck();
		 tpc.sub(10);
		 tpc.sub(12, 10);
		
	}

}
