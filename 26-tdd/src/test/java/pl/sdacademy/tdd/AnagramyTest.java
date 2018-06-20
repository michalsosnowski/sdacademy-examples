package pl.sdacademy.tdd;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.assertj.core.api.Assertions.*;

public class AnagramyTest {
	@DisplayName("should convert pies to siep" )
	@Test
	void pies(){
		//given
		String str = "pies";
		//when
		Set<String> piescidelko= Anagramy.converter(str);
		//then
		assertThat(piescidelko).contains("siep");
	}
	@DisplayName("should convert pies to epis" )
	@Test
	void epis(){
		//given
		String str = "pies";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//then
		assertThat(piescidelko).contains("epis");
	}
	@DisplayName("should convert jo to all anagrams" )
	@Test
	void wszystkieJo(){
		//given
		String str = "jo";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//then
		assertThat(piescidelko).containsOnly("jo","oj");
	}
	@DisplayName("should convert oo to all anagrams" )
	@Test
	void wszystkieOo(){
		//given
		String str = "oo";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//then
		assertThat(piescidelko).containsOnly("oo");
	}

	@DisplayName("should convert kot to all anagrams" )
	@Test
	void wszystkieKot(){
		//given
		String str = "kot";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//then
		assertThat(piescidelko).containsOnly("otk","tok","kto","okt","kot","tko");
	}

	@DisplayName("should convert oooo to all anagrams" )
	@Test
	void wszystkieOOOO(){
		//given
		String str = "oooo";
		//when
		Set<String> piescidelko = Anagramy.converter(str);
		//then
		assertThat(piescidelko).containsOnly("oooo");
	}
}