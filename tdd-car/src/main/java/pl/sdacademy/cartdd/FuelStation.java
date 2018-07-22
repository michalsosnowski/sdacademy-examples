package pl.sdacademy.cartdd;

 class FuelStation {


 	void refuelTank(Car car, int fuel){
 		car.setCurrentVolumeOfFuel(car.getCurrentVolumeOfFuel() + fuel);
	}

	 void refuelToFull(Car car){
		car.setCurrentVolumeOfFuel(car.getMaxVolumeOfFuel());
	}

	 int payForFuelToFull(Car car) {
		return (car.getMaxVolumeOfFuel() - car.getCurrentVolumeOfFuel()) * car.getTypeFuel().getPrice() ;
	}

	 public int payForFuel(int cena, int fuel) {
		 return cena * fuel;
	 }
 }
