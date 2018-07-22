package pl.sdacademy.cartdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RaceTest {
	@DisplayName("Should change used values of fuel, clean and tires per one lap")
	@Test
	void test00() {
		//given
		Car car = new Car();
		Race race = new Race(1);
		car.setTires(80);
		car.setClean(100);
		car.setCurrentVolumeOfFuel(60);
		//when
		race.nLaps(car, 1);
		//then
		assertThat(car.getCurrentVolumeOfFuel()).isEqualTo(58);
	}
	@DisplayName("Should change used values of fuel, clean and tires per hundred laps")
	@Test
	void test01() {
		//given
		Car car = new Car();
		Race race = new Race(100);
		car.setTires(100);
		car.setClean(100);
		car.setCurrentVolumeOfFuel(60);
		//when
		race.nLaps(car, 100);
		//then
		assertThat(car.getCurrentVolumeOfFuel()).isEqualTo(-140);
		assertThat(car.getClean()).isEqualTo( 0);
		assertThat(car.getTires()).isEqualTo( -200);
	}
}
