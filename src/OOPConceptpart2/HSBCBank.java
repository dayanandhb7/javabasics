package OOPConceptpart2;

public class HSBCBank implements USBank, BrazilBank {

	// we are achieving multiple inheritance
	// IS-A relationship

// if a class is implementing any Interface then its mandatory to define/override all methods of Interface

	// overriding from USBank
	public void debit() {
		System.out.println("hsbc--debit");
	}

	public void credit() {
		System.out.println("hsbc--credit");
	}

	public void transferMoney() {
		System.out.println("hsbc--transferMoney");
	}

	// seperate methods of HSBCBank class
	public void educationLoan() {
		System.out.println("hsbc--edu loan");
	}

	public void carLoan() {
		System.out.println("hsbc--car loan");
	}

	// BrazilBank method : overriding from brazilbank
	public void mutualFund() {
		System.out.println("hsbc--mutualFund");

	}

}
