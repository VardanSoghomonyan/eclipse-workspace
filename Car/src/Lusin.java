public class Lusin {
	private static Lusin lusinInstance;

	private Lusin() {
		
	}

	public static Lusin getLusinInstance() {
		if (lusinInstance == null) {
			 lusinInstance = new Lusin();
			return lusinInstance;
		}
		return lusinInstance;
	}
}