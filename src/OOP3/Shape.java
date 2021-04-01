package OOP3;

public abstract class Shape {
	 
	int color;
	
	abstract void drawing();
	
	public void fill() {
		System.out.println("shape--fill");
	}
}
