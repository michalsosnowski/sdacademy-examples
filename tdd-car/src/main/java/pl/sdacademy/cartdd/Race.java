package pl.sdacademy.cartdd;

public class Race {
	int numberOfLaps;

	public Race(int numberOfLaps) {
		this.numberOfLaps = numberOfLaps;
	}


	public int[] nLaps(Car car, int  numberOfLaps) {
		for (int i = 0; i < numberOfLaps; i++) {
			car.setCurrentVolumeOfFuel(car.getCurrentVolumeOfFuel() - UsedCarParameters.FUEL.getUsed());
			car.setClean(car.getClean() - UsedCarParameters.CLEAN.getUsed());
			car.setTires(car.getTires() - UsedCarParameters.TIRES.getUsed());
		}
		return new int[]{car.getCurrentVolumeOfFuel(), car.getClean(), car.getTires()};
	}
}
