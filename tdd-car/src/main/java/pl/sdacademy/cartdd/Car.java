package pl.sdacademy.cartdd;

public class Car {

	private int volume;
	private int tank;
	private TypeFuel typeFuel;
	private int clean;

	public int getClean() {
		return clean;
	}

	public void setClean(int clean) {
		this.clean = clean;
	}

	public static Car create(int tank) {

		Car car = new Car();
		car.tank=tank;
		return  car;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public TypeFuel getTypeFuel() {
		return typeFuel;
	}

	public void setTypeFuel(TypeFuel typeFuel) {
		this.typeFuel = typeFuel;
	}

	int getTank() {
		return tank;
	}

	 void setTank(int tank) {
		this.tank = tank;
	}

}
