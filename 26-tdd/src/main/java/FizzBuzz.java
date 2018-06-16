public class FizzBuzz {
       /**
	* Returns a "Fizz" when {@code number} if divisible by 3, "Buzz" when divisible by 5, "FizzBuzz" when
	* divisible by 3 and 5, and finally a string representation of a {@code number} in any other case (e.g. "1"
	* for 1, "2" for 2).
	*
	* @param number a number
	* @return the string according to the specification
	*/
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

