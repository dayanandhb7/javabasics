package JavaQuestions;

public class FactorialNumber {

	public static void main(String[] args) {

		// 5! = 5x4x3x2x1 = 120
		// 4! = 4x3x2x1 = 24
		// 0! = 1

		int num = 6;
		getFact(num);

	}

	private static void getFact(int num) {
		int fact = 1;

		for (int i = 1; i <= num; i++) {
			fact = fact * i;
		}
		System.out.println("factorial of " + num + " is : " + fact);
	}

}
