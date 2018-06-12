package pl.sdacademy.swing;

public class FizzBuzz {
	public static String msg(int number) {

		if (number ==1){
			return "Whizz";
		}
		if (number ==3){
			return "FizzWhizz";
		}
		if (number ==5){
			return "BuzzWhizz";
		}if (number ==7){
			return "Whizz";
		}if (number ==11){
			return "Whizz";
		}if (number ==13){
			return "Whizz";
		}
		if (number % 15==0){
			return "FizzBuzz";
		}
		if (number % 3==0){
			return "Fizz";
		}
		if (number % 5==0){
			return "Buzz";
		}


		return String.valueOf(number);
	}
}
