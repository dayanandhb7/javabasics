package OOPConceptpart2;

public interface USBank {

	public static final int min_bal = 100;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
	
	
	// only method declaration
	// no method body -- only method prototype
	// in Interface we can declare variables, variables are by default static in nature
	// variable value will not be changed
	// no static method in Interface
	// no main method in Interface
	// we cannot create the object of interface
	// Interface is abstract in nature
	
	
}
