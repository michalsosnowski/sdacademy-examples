package pl.sdacademy.budowniczy;

public class Pizzeria {
	public static void main(String[] args) {
		Pizza pizza = Pizza.newBuilder()
			.withDough("Cross")
			.withSauce("pomatto")
			.withTopping("Salami")
			.build();
		System.out.println(pizza);
	}
}
