package pl.sdacademy.cartdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CarWashTest {
	Car car;
	CarWash carWash;

	@BeforeEach
	void setup() {
		car = new Car();
		carWash = new CarWash();
	}

	@DisplayName("Should set clean a car with given dirt level")
	@Test
	void test00() {
		//given
		car.setClean(20);
		//when
		carWash.clean(car);
		int cleanCar = car.getClean();
		//then
		assertThat(cleanCar).isEqualTo(100);
	}


}
