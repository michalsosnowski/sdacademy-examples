package pl.sdacademy.tdd;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

public class AnagramTest {
	@Test
	void isNotEmpty(){
		//given
		String word ="";
		//when
		String result = Anagram.result(word);
		//then
		Assertions.assertThat(result).isEqualTo("");

	}
	@Test
	void returSomeWord(){
		//given
		String word ="something";
		//when
		String result = Anagram.result(word);
		//then
		Assertions.assertThat(result).isEqualTo("something");

	}@Test
	void returSequence(){
		//given
		String word ="so";
		//expected
		List<String> expected = new ArrayList<String>(){};
		//when
		String result = Anagram.result(word);
		//then
		Assertions.assertThat(result).isEqualTo(expected);


	}
}
