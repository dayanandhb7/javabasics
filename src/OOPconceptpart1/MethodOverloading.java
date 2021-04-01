package OOPconceptpart1;

public class MethodOverloading {

	public static void main(String[] args) {
		
		MethodOverloading obj = new  MethodOverloading();
		
		obj.sum();
		obj.sum(10);
		obj.sum(15, 5);
		
	}

	// you cannot create method inside a method
	
	// method overloading - when the method name is same with diff arguemrnts or input parameters
	public void sum() {  // zero input parameter
		System.out.println("sum method-zero para");
		
	}
	
	public void sum(int i) {  // one input parameter
		System.out.println("sum method-one para");
		System.out.println(i);
		
	}

	public void sum(int k, int l) {  // two input parameters
		System.out.println("sum method-two para");
		System.out.println(k+l);
		
	}
	
}
