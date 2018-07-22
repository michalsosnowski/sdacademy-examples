package pl.sdacademy.cartdd;

public class Car {

	private int maxVolumeOfFuel;
	private int currentVolumeOfFuel;
	private TypeFuel typeFuel;
	private int clean;
	private int tires;

	public int getClean() {
		return clean;
	}

	public void setClean(int clean) {
		this.clean = clean;
	}

	public static Car create(int tank) {

		Car car = new Car();
		car.currentVolumeOfFuel =tank;
		return  car;
	}

	public int getMaxVolumeOfFuel() {
		return maxVolumeOfFuel;
	}

	public void setMaxVolumeOfFuel(int maxVolumeOfFuel) {
		this.maxVolumeOfFuel = maxVolumeOfFuel;
	}

	public TypeFuel getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(TypeFuel typeFuel) {
		this.typeFuel = typeFuel;
	}

	int getCurrentVolumeOfFuel() {
		return currentVolumeOfFuel;
	}

	 void setCurrentVolumeOfFuel(int currentVolumeOfFuel) {
		this.currentVolumeOfFuel = currentVolumeOfFuel;
	}

	public void setTires(int tires) {
		this.tires = tires;
	}

	public int getTires() {
		return tires;
	}
}
