import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

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
		//when
		String result = Anagram.result(word);
		//then
		Assertions.assertThat(result).isEqualTo("os");

	}
}
