package pl.sdacademy.cartdd;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PitstopTest {
	@DisplayName("Should change tires if is in low level to new")
	@Test
	void test00() {
		//given
		Car car = new Car();
		Race race =new Race(27);
		Pitstop pitstop = new Pitstop(10, 20, 20);
		car.setCurrentVolumeOfFuel(100);//-2
		car.setClean(100);//-1
		car.setTires(100);//-3
		//when
		pitstop.service(car,race);

		//then
		assertThat(car.getTires()).isEqualTo(100);
	}
	@DisplayName("Should change fuel if is in low level to new")
	@Test
	void test01() {
		//given
		Car car = new Car();
		car.setMaxVolumeOfFuel(100);
		Race race =new Race(47);
		Pitstop pitstop = new Pitstop(10, 20, 20);
		car.setCurrentVolumeOfFuel(100);//-2
		car.setClean(100);//-1
		car.setTires(100);//-3
		//when
		pitstop.service(car,race);

		//then
		assertThat(car.getCurrentVolumeOfFuel()).isEqualTo(98);

	}
	@DisplayName("Should change clean up if is in low level to new")
	@Test
	void test02() {
		//given
		Car car = new Car();
		car.setMaxVolumeOfFuel(100);
		Race race =new Race(82);
		Pitstop pitstop = new Pitstop(10, 20, 20);
		car.setCurrentVolumeOfFuel(100);//-2
		car.setClean(100);//-1
		car.setTires(100);//-3
		//when
		pitstop.service(car,race);

		//then
		assertThat(car.getClean()).isEqualTo(99);

	}
	@DisplayName("Should check clean if is in low level return true")
	@Test
	void test03() {
		//given
		Car car = new Car();
		car.setMaxVolumeOfFuel(100);
		Pitstop pitstop = new Pitstop(10, 20, 20);
		car.setCurrentVolumeOfFuel(100);//-2
		car.setClean(19);//-1
		car.setTires(100);//-3
		//when
		boolean res = pitstop.needService(car);

		//then
		assertThat(res).isEqualTo(true);

	}
}
