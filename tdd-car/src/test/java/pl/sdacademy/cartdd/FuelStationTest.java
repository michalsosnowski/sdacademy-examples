package pl.sdacademy.cartdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class FuelStationTest {
	Car car;
	FuelStation fuelStation;

	@BeforeEach
	void setup() {
		car = new Car();
		fuelStation = new FuelStation();
		car.setMaxVolumeOfFuel(200);
	}

	@DisplayName("Should check tank is refuel to full")
	@Test
	void test00() {
		//given
		car.setCurrentVolumeOfFuel(20);
		//when
		fuelStation.refuelToFull(car);
		//then
		assertThat(car.getCurrentVolumeOfFuel()).isEqualTo(car.getMaxVolumeOfFuel());
	}

	@DisplayName("Should return price of tanked full fuel")
	@Test
	void test01() {
		//given
		car.setCurrentVolumeOfFuel(20);
		car.setTypeFuel(TypeFuel.DIESEL);

		//when
		fuelStation.payForFuelToFull(car);

		//then
		assertThat(fuelStation.payForFuelToFull(car)).isEqualTo(900);
	}

	@DisplayName("Should return price of tanked fuel")
	@Test
	void test02() {
		//given
		car.setCurrentVolumeOfFuel(20);
		int fuel = 30;
		int cena = 5;
		//when
		fuelStation.refuelTank(car, fuel);

		//then
		assertThat(fuelStation.payForFuel(cena, fuel)).isEqualTo(150);
	}

	@DisplayName("Should check type of kind car's fuel")
	@Test
	void test03() {
		//given
		car.setTypeFuel(TypeFuel.DIESEL);
		//when
		TypeFuel typeFuel = car.getTypeFuel();
		//then
		assertThat(typeFuel).isEqualTo(TypeFuel.DIESEL);
	}
}
