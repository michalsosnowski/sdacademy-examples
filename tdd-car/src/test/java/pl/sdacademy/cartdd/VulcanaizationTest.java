package pl.sdacademy.cartdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class VulcanaizationTest {
	@DisplayName("Should replace tires in car")
	@Test
	void test00() {
		//given
		Car car= new Car();
		Vulcanaization vulcanization=new Vulcanaization();
		car.setTires(20);
		//when
		vulcanization.changeTires(car);
		int changeTiresInCar = car.getTires();
		//then
		assertThat(changeTiresInCar).isEqualTo(100);
	}
}
