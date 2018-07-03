package pl.sdacademy.vat;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Kwota {

	public static void main(String[] args) {


		List<BigDecimal> kwoty = new ArrayList<>();
		List<BigDecimal> kwotyVat = new ArrayList<>();

		BigDecimal vat;

		BigDecimal kwota;

		int j=0;
		for (int i = 0; i <= 999999999; i++) {

			kwota = BigDecimal.valueOf(j);
			kwoty.add(kwota);
			vat = kwota.multiply(BigDecimal.valueOf(0.23)).setScale(2,RoundingMode.HALF_UP);


			kwotyVat.add(vat);

			System.out.println(kwotyVat.get(j));
			j++;

		}
		kwoty.stream().forEach(System.out::println);
		kwotyVat.stream().forEach(System.out::println);

	}

}
