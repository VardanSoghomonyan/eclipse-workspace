package business_objects;

public class Bernatar extends Car implements BernatarActions {
	private double kuzovVolume;
	private boolean isSamasval;

	@Override
	public boolean isSamasval() {
		if (isSamasval) {
			return true;
		}
		return false;
	}

}
