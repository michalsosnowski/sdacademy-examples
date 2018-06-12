package pl.sdacademy.swing.homework;


import javafx.animation.Animation;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import pl.sdacademy.swing.FizzBuzz;

public class FizzBuzzTest {
	@Test
	void fizzBuzzTest(){
		//given
		int number =1;
		//when
		String msg = FizzBuzz.msg(number);
		//then
		Assertions.assertThat(msg).isEqualTo("");

	}
	@Test
	void fizzDivByThree(){
		//given
		int number=9;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Fizz");

	}
	@Test
	void fizzDivByFive(){
		//given
		int number=5;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("Buzz");

	}
	@Test
	void fizzDivByFiveteen(){
		//given
		int number=15;

		//when
		String msg = FizzBuzz.msg(number);

		//then

		Assertions.assertThat(msg).isEqualTo("FizzBuzz");

	}
}
