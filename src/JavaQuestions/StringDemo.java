package JavaQuestions;

public class StringDemo {

	public static void main(String[] args) {

		String s1 = "happy";
		System.out.println(s1);
		System.out.println(s1.length());

		System.out.println(s1 + "learning");
		s1 = s1 + "learning";
		System.out.println(s1.length());

		System.out.println(s1.substring(10));
		System.out.println(s1.isEmpty());
		System.out.println(s1);
System.out.println(s1.toUpperCase());
	}

}
