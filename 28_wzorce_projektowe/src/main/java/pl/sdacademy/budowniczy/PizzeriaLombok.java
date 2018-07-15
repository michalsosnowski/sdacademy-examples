package pl.sdacademy.budowniczy;

public class PizzeriaLombok {
	public static void main(String[] args) {


		PizzaLombok pizza = PizzaLombok.builder()
			.dough("Cross")
			.sauce("chilly")
			.topping("chicken")
			.build();
		System.out.println(pizza);
	}
}