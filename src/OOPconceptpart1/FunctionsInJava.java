package OOPconceptpart1;

public class FunctionsInJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FunctionsInJava obj = new FunctionsInJava();
		
		obj.test();
		int l = obj.pqr();
		System.out.println(l);
		
		String s1 = obj.qa();
		System.out.println(s1);
		
		int div = obj.division(30,10);
		System.out.println(div);
		
		// main method is void - never returns a value
	}
	
	// non static methods 
	
// void - does not return any value
	public void test() {
		System.out.println("test method");
	}
	
	// return type - int
	public int pqr() {
		System.out.println("PQR method");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	public String qa() {
		System.out.println("qa method");
		String s = "selenium";
		
		return s;
	}
	
// return type - int
	// x,y -- input parameters
	public int division(int x,int y) {
		System.out.println("division method");
		int d = x/y;
		 return d;
		 
		
	}
}
