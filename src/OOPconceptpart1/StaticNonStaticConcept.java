package OOPconceptpart1;

public class StaticNonStaticConcept {

	String name =  "tom";
	static int age = 25;
	
	public static void main(String[] args) {
		
// how to call static method
		sum(); // direct calling 
		StaticNonStaticConcept.sum();  // calling by classname
		
		System.out.println(age);
		System.out.println(StaticNonStaticConcept.age);
		
		// how to call non static method
		StaticNonStaticConcept obj = new StaticNonStaticConcept();
		obj.sendMail();
		System.out.println(obj.name);
		
	}

	public void sendMail() {
		System.out.println("send mail method");
	}
	
	
	public static void sum() {
		System.out.println("sum method");
	}
}
