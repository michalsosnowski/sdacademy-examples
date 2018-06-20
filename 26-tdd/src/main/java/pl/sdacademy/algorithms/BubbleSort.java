package pl.sdacademy.algorithms;


public class BubbleSort implements Sort {
	public static int[] calculate(int[] number) {
		for (int i = 0; i < number.length - 1; i++)
			for (int j = 0; j < number.length - 1 - i; j++)

				if (number[j] > number[j + 1]) {
					int temp = number[j];
					number[j] = number[j + 1];
					number[j + 1] = temp;
				}


		return number;
	}
}
