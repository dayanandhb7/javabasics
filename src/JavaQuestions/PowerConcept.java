package JavaQuestions;

public class PowerConcept {

	public static void main(String[] args) {

//  3^4 = 81
		
		int base = 2;
		int exponent = 3;
		 
		long result = 1;
		
		while(exponent != 0) {
			result *= base;   //result * base
			--exponent;
		}
		
		System.out.println(result);
		
		// System.out.println(Math.pow(base, exponent));
		
	}

}
