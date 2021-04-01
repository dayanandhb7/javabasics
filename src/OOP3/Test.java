package OOP3;

public class Test extends Shape {

	public static void main(String[] args) {

		Shape s = new Test();
		s.drawing();
		s.fill();

		Test t = new Test();
		
	}

	@Override
	void drawing() {
		System.out.println("test--drawing");
	}

}
