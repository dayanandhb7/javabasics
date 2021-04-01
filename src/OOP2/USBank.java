package OOP2;

public interface USBank {
	int min_bal = 100;

	public void debit();

	public void credit();

	public void transferMoney();

	public void trading();

	// Only method declaration
	// No method body - only method prototype
	// In Interface we can declare the variables,variables are by default static in nature
	// variable value will not be changed
	// No static method in Interface
	// No Main method in Interface
	// We can not create the object of Interface
	// Interface abstract in nature

}
