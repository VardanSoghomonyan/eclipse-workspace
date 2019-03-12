package accounting_module;

public class Company_accounting {
	public static int total_balance = 1000000;

	public static void buySeed(int seed) {
		total_balance = total_balance - 2 * seed;
	}

	public static void buyTree(int tree) {
		total_balance = total_balance - 10 * tree;
	}

	public static void cultivate() {
		total_balance = total_balance - 20;
	}

	public static void plant(int tree) {
		total_balance = total_balance - 5 * tree;
	}

	public static void toSeed() {
		total_balance--;
	}

	public static void sellFruit(int fruit) {
		total_balance = total_balance + 10 * fruit;
	}

	public static void sellVegetable(int vegeteble) {
		total_balance = total_balance + 7 * vegeteble;
	}

	public static void sellFlower(int flower) {
		total_balance = total_balance + 4 * flower;
	}
}