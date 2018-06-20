package pl.sdacademy.tdd;
import java.util.*;


public class Anagram {
	/*public static void main(String[]args){
		result("sor");
	}*/
	public static String result(String word) {

		List<String> sequence = new ArrayList<>();

		String cha[] =word.split("");
		for (int i = 0; i < cha.length; i++) {
			sequence.add(cha[i]);
		}
		Set<String> newWord= new HashSet<>();
		for (int i = 0; i < cha.length; i++) {
			for (int j = 0; j < cha.length; j++) {

			if (!cha[i].equals(cha[j])) {
				newWord.add(cha[i] + cha[j]);

			}
		}}
//		System.out.println(sequence);
//		System.out.println(newWord);
		return String.valueOf(newWord);
	}
}
