import java.util.*;


public class Anagram {
	public static void main(String[]args){
		result("so");
	}
	public static String result(String word) {

		List<String> sequence = new ArrayList<>();

		String cha[] =word.split("");
		for (int i = 0; i < cha.length; i++) {
			sequence.add(cha[i]);
		}
		Set<String> randomSeq= new HashSet<>();
		for (int i = 0; i < cha.length; i++) {
			for (int j = 0; j < cha.length; j++) {

			randomSeq.add(cha[i] + cha[j]);
			if (cha[i].equals(cha[i])) {
				randomSeq.remove(randomSeq);

			}
		}}
		System.out.println(sequence);
		System.out.println(randomSeq);
		return String.valueOf(randomSeq);
	}
}
