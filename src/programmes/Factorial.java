package programmes;

public class Factorial {

	// Factorial of 3 : 3*2*1 = 6
				// Factorial of 4 : 4*3*2*1 = 24
				// Factorial of 5 : 5*4*3*2*1 = 120
				// Factorial of 3 : 3*2*1 = 6
				// Factorial of 10: 10*9*8*7*6*5*4*3*2*1 
				// 1! = 1
				// 0! = 1
	
	// Without recursion : using for loop 
	public static int factorial(int num) {
		int fact = 1;
		for(int i = 1; i<=num; i++) {
			fact = fact*i;
		}
		return fact;	
		}
		
	
	// Using recursion : a function is calling itself
	public static int fact(int num) {
		if(num==0)
			return 1;
		else
			return(num * fact(num-1));
		}
	
	
	 public static void main(String[] args) {
		 
		 System.out.println(factorial(4));
		 System.out.println(factorial(1));
		 System.out.println(fact(5));
		 System.out.println(fact(10));
	}

}
