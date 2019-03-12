package business_objects;

public class Bernatar extends Car implements BernatarActions{
	private double kuzovVolume;
	private double isSamasval;

	@Override
	public boolean isSamasval() {
		if (isSamasval) {
			return true;
		}
		return false;
	}

	
}
