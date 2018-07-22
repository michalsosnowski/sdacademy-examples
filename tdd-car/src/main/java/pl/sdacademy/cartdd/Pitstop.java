package pl.sdacademy.cartdd;

public class Pitstop {
	Vulcanaization vulcanization = new Vulcanaization();
	CarWash carWash = new CarWash();
	FuelStation fuelStation = new FuelStation();
	private int tresholdOfFuel;
	private int tresholdOfClean;
	private int tresholdOfTires;

	public Pitstop(int tresholdOfFuel, int tresholdOfClean, int tresholdOfTires) {
		this.tresholdOfFuel = tresholdOfFuel;
		this.tresholdOfClean = tresholdOfClean;
		this.tresholdOfTires = tresholdOfTires;
	}

	public void service(Car car, Race race) {

		for (int i = 1; i <= race.numberOfLaps; i++) {
			race.nLaps(car, 1);
			if (car.getTires() < this.tresholdOfTires) {
				vulcanization.changeTires(car);
			}
			if (car.getClean() < this.tresholdOfClean) {
				carWash.clean(car);
			}
			if (car.getCurrentVolumeOfFuel() < this.tresholdOfFuel) {
				fuelStation.refuelToFull(car);
			}
		}
	}

	public boolean needService(Car car) {
		boolean result = false;
		if (car.getTires() < this.tresholdOfTires) {
			result = true;
		}
		if (car.getClean() < this.tresholdOfClean) {
			result = true;
		}
		if (car.getCurrentVolumeOfFuel() < this.tresholdOfFuel) {
			result = true;
		}
		return result;

	}
}
