package pl.sdacademy.tdd;

import java.util.ArrayList;
import java.util.List;


public class Fibonacci {
	public static void main(String[]args){
		long start =System.currentTimeMillis();

		for (int i = 2; i < 999999999; i++) {
			System.out.println(result(i));

			long end = System.currentTimeMillis();
			System.out.println("Elapsed time: "+(end - start));
		}
	}
	public static Integer result(int number) {
		List<Integer> ciag = new ArrayList<>();
		ciag.add(0);
		ciag.add(1);
		for (int i = 2; i < number; i++) {

			ciag.add(ciag.get(i - 1) + ciag.get(i - 2));
		}

		if (number != 1) {
			return ciag.get(number - 1) + ciag.get(number - 2);

		}

		return number;
	}
}
