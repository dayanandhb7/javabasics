package programmes;

public class PalindromeNumber {

	// 151 454 34543 78987
	// teet

	public static void isPalindromeNumber(int num) {
		System.out.println("Given Number is :" + num);

		int r = 0;
		int sum = 0;
		int t;

		t = num;

		while (num > 0) {
			r = num % 10; // get the remainder
			sum = (sum * 10) + r;
			num = num / 10;
		}

		if (t == sum) {
			System.out.println("Palindrome Number");
		} else {
			System.out.println("not Palindrome Number");
		}

	}

	public static void main(String[] args) {

		isPalindromeNumber(151);
		isPalindromeNumber(152);
		isPalindromeNumber(78987);
	}

}
