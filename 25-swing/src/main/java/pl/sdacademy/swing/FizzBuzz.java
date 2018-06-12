package pl.sdacademy.swing;

public class FizzBuzz {
	public static String msg(int number) {

		String msg="";
		if (number == 3){
			 msg = "Fizz";
		}
		if (number == 5){
			msg="Buzz";
		}
		if (number == 15){
			msg="FizzBuzz";
		}

		return msg;
	}
}
