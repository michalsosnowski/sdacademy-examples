package pl.sdacademy.algorithms;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.*;

public class BubbleSortTest {

	/*@DisplayName("Should return some number when we give it")
	@Test
	void test00(){
		//given
		int number=3;

		//when
		int result = BubbleSort.calculate(number);

		//then
		assertThat(result).isEqualTo(3);
	}*/
	@DisplayName("Should return two numbers when we give them")
	@Test
	void test01() {
		int[] numbers = new int[]{3,1};

		//when
		int[] result = BubbleSort.calculate(numbers);

		//then
		assertThat(result).containsOnly(1, 3);
	}

	@DisplayName("Should return sequence of tree numbers when we give them")
	@Test
	void test02() {
		//given
		int[] numbers = new int[]{3,4,1};

		//when
		int[] result = BubbleSort.calculate(numbers);

		//then
		assertThat(result).containsSequence(1, 3, 4);
	}
	@DisplayName("Should return sequence of six numbers when we give them")
	@Test
	void test03() {
		//given
		int[] numbers = new int[]{3,4,1,0,34,11};

		//when
		int[] result = BubbleSort.calculate(numbers);

		//then
		assertThat(result).containsSequence(0,1, 3, 4,11,34);
	}
}
