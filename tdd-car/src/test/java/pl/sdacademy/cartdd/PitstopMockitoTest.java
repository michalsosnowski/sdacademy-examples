package pl.sdacademy.cartdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.BDDMockito.then;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.times;

@ExtendWith(MockitoExtension.class)
public class PitstopMockitoTest {

	@Spy
	Vulcanaization vulcanaization;
	@Mock
	FuelStation fuelStation;
	@Mock
	CarWash carWash;

	Pitstop pitstop;

	@BeforeEach
	void setUp() {
		pitstop = new Pitstop(10, 20, 20,
			vulcanaization, carWash, fuelStation);
	}

	@DisplayName("Should change tires once")
	@Test
	void test00() {
		//given
		Car car = new Car();
		Race race =new Race(27);
		car.setTires(100);
		//when
		pitstop.service(car,race);
		//then
		then(vulcanaization).should().changeTires(car);
	}
	@DisplayName("Should change tires twice")
	@Test
	void test01() {
		//given
		Car car = new Car();
		Race race =new Race(60);
		car.setTires(100);
		car.setMaxVolumeOfFuel(100);
		car.setCurrentVolumeOfFuel(100);
		car.setClean(100);
		//when
		pitstop.service(car,race);
		//then
		then(vulcanaization).should(times(2)).changeTires(car);
	}


}
