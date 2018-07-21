package pl.sdacademy.cartdd;

 class FuelStation {


 	void refuelTank(Car car, int fuel){
 		car.setTank(car.getTank() + fuel);
	}

	 void refuelToFull(Car car){
		car.setTank(car.getVolume());
	}

	 int payForFuelToFull(Car car) {
		return (car.getVolume() - car.getTank()) * car.getTypeFuel().getPrice() ;
	}

	 public int payForFuel(int cena, int fuel) {
		 return cena * fuel;
	 }
 }
