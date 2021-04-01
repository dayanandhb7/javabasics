package OOP2;

public class TestBank {

	public static void main(String[] args) {

		ICICIBank ic = new ICICIBank();
		ic.educationLoan();
		ic.carLoan();
		ic.homeLoan();
		
		ic.debit();
		ic.credit();
		ic.transferMoney();
		ic.trading();
		
		ic.mutualFunds();
		ic.insurance();
		
		System.out.println(USBank.min_bal);
		
		USBank us = new ICICIBank();
		us.debit();
		us.credit();
		us.trading();
		us.transferMoney();
		
		
	}

}
