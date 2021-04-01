package OOP2;

public class ICICIBank implements USBank, RBI {

	
	// RBI interface
	

	@Override
	public void homeLoan() {
		System.out.println("icici--homeloan");

	}

	@Override
	public void carLoan() {
		System.out.println("icici--carloan");

	}

	// USBank interface
	@Override
	public void debit() {
		System.out.println("icici--debit");

	}

	@Override
	public void credit() {
		System.out.println("icici--credit");

	}

	@Override
	public void transferMoney() {
		System.out.println("icici--transfermonry");

	}

	@Override
	public void trading() {
		System.out.println("icici--trading");
	}

	
	// ICICI banklass methods
	public void mutualFunds() {
		System.out.println("icici--mutual funds");
	}
	
	public void insurance() {
		System.out.println("icici--insurance");
	}

	@Override
	public void educationLoan() {
		// TODO Auto-generated method stub
		
	}
}
