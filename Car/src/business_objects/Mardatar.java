package business_objects;

public class Mardatar extends Car {
	private double bagajnikVolume;

	public Mardatar setMark(String mark) {
		this.mark = mark;
		return this;
	}

	public Mardatar setModel(String model) {
		this.model = model;
		return this;
	}

	public Mardatar setBodyType(String bodyType) {
		this.bodyType = bodyType;
		return this;
	}

	public Mardatar setBagajnikVolume(double bagajnikVolume) {
		this.bagajnikVolume = bagajnikVolume;
		return this;
	}
}