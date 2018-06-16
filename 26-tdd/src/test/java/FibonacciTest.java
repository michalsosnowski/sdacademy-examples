import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class FibonacciTest {
	@Test
	void sequense(){
		//given
		int number =1;
		//when
		int result = Fibonacci.result(number);
		//then
		Assertions.assertThat(result).isEqualTo(1);

	}@Test
	void sequenseTwo(){
		//given
		int number =2;
		//when
		int result = Fibonacci.result(number);
		//then
		Assertions.assertThat(result).isEqualTo(1);

	}@Test
	void sequenseTree(){
		//given
		int number =3;
		//when
		int result = Fibonacci.result(number);
		//then
		Assertions.assertThat(result).isEqualTo(2);

	}@Test
	void sequenseFour(){
		//given
		int number =4;
		//when
		int result = Fibonacci.result(number);
		//then
		Assertions.assertThat(result).isEqualTo(3);

	}@Test
	void sequenseEight(){
		//given
		int number =17;
		//when
		int result = Fibonacci.result(number);
		//then
		Assertions.assertThat(result).isEqualTo(1597);

	}
}
