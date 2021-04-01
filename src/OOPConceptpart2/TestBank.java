package OOPConceptpart2;

public class TestBank {

	public static void main(String[] args) {
	
		System.out.println(USBank.min_bal);
		HSBCBank b = new HSBCBank();
		b.debit();
		b.credit();
		b.transferMoney();
		b.educationLoan();
		b.carLoan();
		
		
		// dynamic polymorphism : 
		// child class object can be referred by parent interface reference variable

		USBank h = new HSBCBank();
		h.debit();
		h.credit();
		h.transferMoney();
		
		BrazilBank e = new HSBCBank();
		e.mutualFund();
	}

}
