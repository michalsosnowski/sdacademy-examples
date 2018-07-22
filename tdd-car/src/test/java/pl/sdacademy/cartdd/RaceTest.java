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
		int[] lap = race.nLaps(car, 1);
		//then
		assertThat(lap).isEqualTo(new int[]{58, 99, 77});
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
		int[] laps = race.nLaps(car, 100);
		//then
		assertThat(laps).isEqualTo(new int[]{-140, 0, -200});
	}
}
