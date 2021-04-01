package practice;

public class StirngBuffer {

	public static void main(String[] args) {

		StringBuffer s4 = new StringBuffer("sagar");
		System.out.println(s4);
		s4.append("dayanand");
		System.out.println(s4);
		System.out.println(s4.charAt(1));

		System.out.println(s4.reverse());
		s4.delete(0, 8);
		System.out.println(s4);

	}

}
