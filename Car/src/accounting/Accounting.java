package accounting;

public class Accounting {
	private int total_balance = 1000000;
	private static Accounting accountingInstance;
	
	private Accounting() {
		
	}
	
	public static Accounting getAccountingInstance() {
		if (accountingInstance == null) {
			accountingInstance = new Accounting();
			return accountingInstance;
		}
		return accountingInstance;
	}

	public void buyKarkas(int karkas) {
		total_balance = total_balance - 1000 * karkas;
	}

	public void buyWheels(int wheels) {
		total_balance = total_balance - 100 * wheels;
	}

	public void assemble(int cars) {
		total_balance = total_balance - 20*cars;
	}

	public void buyColor(int color) {
		total_balance = total_balance - 50 * color;
	}

	public void paint(int cars) {
		total_balance -= 10*cars;
	}

	public void sellMardatar(int mardatar) {
		total_balance = total_balance + 5000 * mardatar;
	}

	public void sellBernatar(int bernatar) {
		total_balance = total_balance + 10000 * bernatar;
	}
}