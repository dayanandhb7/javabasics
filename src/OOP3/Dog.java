package OOP3;

public class Dog extends Animal {

	public static void main(String[] args) {

		Animal d = new Dog();
		d.eat();
		Dog d1 = new Dog();
		d1.eat();
		d1.sleep();
	}

	public void sleep() {
		System.out.println("Dog--sleep");
	}
}
